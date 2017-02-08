package com.vp.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;


public class Course {

    @Id
    public String id;

    public String name;
    public String type;
    public Date startDate;
    public Date endDate;
    public boolean presence;
    public String providerType;
    public String trainer;
    public float totalHours; 
    public float projectHours;
    public int usersEnrolled;

    public Course() {}

    public Course(String id, String name, String type, Date startDate, Date endDate, boolean presence, String providerType,
    			  String trainer, float totalHours, float projectHours, int usersEnrolled) {
    	this.id = id;
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.presence = presence;
        this.providerType = providerType;
        this.trainer = trainer;
        this.totalHours = totalHours; 
        this.projectHours = projectHours;
        this.usersEnrolled = usersEnrolled;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', type='%s']",
                id, name, type);
    }

}

