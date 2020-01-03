package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
@Table(name="users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name= "password")
    private String password;

    @Column(name= "firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="role")
    private String role;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    @JsonIgnore
    public String getPassword() {

        return this.password;
    }

    @JsonProperty
    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }


    public String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }







}