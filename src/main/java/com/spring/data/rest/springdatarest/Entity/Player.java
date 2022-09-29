package com.spring.data.rest.springdatarest.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity             // RowMapping (create database/schema)

public  class Player {

    @Id
    @GeneratedValue
    private int pid; // Primary Key

    private String name;

    private int age;

    private String nationality;

    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date dob;

    private int designation;

    public Player() {

    }


    // JPA constructor PID is autoConfigured
    public Player(String name, int age, String nationality, Date dob, int designation) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.dob = dob;
        this.designation = designation;
    }

    public Player(int pid, String name, int age, String nationality, Date dob, int designation) {
        this.pid = pid; // id also valid
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.dob = dob;
        this.designation = designation;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getDob() {
        return dob;
    }

    public int getDesignation() {
        return designation;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", dob=" + dob +
                ", designation=" + designation +
                '}';
    }
}
