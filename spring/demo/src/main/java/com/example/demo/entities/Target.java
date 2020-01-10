package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "targets")
public class Target {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="userid")
    private int userid;

    @Column(name="title")
    private String title;

    @Column(name= "description")
    private String description;

    @Column(name= "solution")
    private String solution;

    @Column(name="percentage")
    private int percentage;

    @Column(name="status")
    private String status;

    @Column(name="created")
    private Date created;

    @Column(name="lastupdated")
    private Date lastupdated;

    public long getId(){
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public int getUserId(){
        return userid;
    }

    public void setUserId(Integer userid){
        this.userid=userid;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getSolution(){
        return this.solution;
    }

    public void setSolution(String solution){
        this.solution = solution;
    }

    public int getPercentage(){
        return percentage;
    }

    public void setPercentage(Integer percentage){
        this.percentage = percentage;

    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }


    public Date getCreated(){
        return created;
    }

    public void setCreated(Date created){
        this.created=created;
    }

    public Date getLastupdated(){
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated){
        this.lastupdated=lastupdated;
    }

	

	


    






}