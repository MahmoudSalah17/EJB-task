package com.sumerge.grad.program.javaee.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

public class StudentModel {
    private Long id;
    private String Name;
    private String rollNumber;

    private Integer gender;

    private Date dob;

    private Float gpa;

    public StudentModel(Long id, String name, String rollNumber, Integer gender, Date dob, Float gpa) {
        this.id = id;
        Name = name;
        this.rollNumber = rollNumber;
        this.gender = gender;
        this.dob = dob;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public String getRollNumber() {
        return rollNumber;

    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
