import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Comment {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    targetid: number;

    @Column()
    update: string;

    @Column()
    userid: number;

}
