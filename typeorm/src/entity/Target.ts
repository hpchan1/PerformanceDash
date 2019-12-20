import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Target {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    userid: string;

    @Column()
    title: string;

    @Column()
    description: string;

    @Column()
    solution: string;

    @Column()
    percentage: number;

    @Column()
    status: string;

    @Column()
    created: Date;

    @Column()
    lastupdated: Date;

}
