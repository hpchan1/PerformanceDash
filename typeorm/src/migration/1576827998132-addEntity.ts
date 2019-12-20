import {MigrationInterface, QueryRunner} from "typeorm";

export class addEntity1576827998132 implements MigrationInterface {
    name = 'addEntity1576827998132'

    public async up(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`CREATE TABLE "comment" ("id" int NOT NULL IDENTITY(1,1), "targetid" int NOT NULL, "update" nvarchar(255) NOT NULL, "userid" int NOT NULL, CONSTRAINT "PK_0b0e4bbc8415ec426f87f3a88e2" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "target" ("id" int NOT NULL IDENTITY(1,1), "userid" nvarchar(255) NOT NULL, "title" nvarchar(255) NOT NULL, "description" nvarchar(255) NOT NULL, "solution" nvarchar(255) NOT NULL, "percentage" int NOT NULL, "status" nvarchar(255) NOT NULL, "created" datetime NOT NULL, "lastupdated" datetime NOT NULL, CONSTRAINT "PK_9d962204b13c18851ea88fc72f3" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "user" ("id" int NOT NULL IDENTITY(1,1), "username" nvarchar(255) NOT NULL, "password" nvarchar(255) NOT NULL, "firstname" nvarchar(255) NOT NULL, "lastname" nvarchar(255) NOT NULL, "role" nvarchar(255) NOT NULL, CONSTRAINT "PK_cace4a159ff9f2512dd42373760" PRIMARY KEY ("id"))`, undefined);
    }

    public async down(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`DROP TABLE "user"`, undefined);
        await queryRunner.query(`DROP TABLE "target"`, undefined);
        await queryRunner.query(`DROP TABLE "comment"`, undefined);
    }

}
