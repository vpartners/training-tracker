package com.vp.model;

import org.springframework.data.annotation.Id;


public class Course {

    @Id
    public String id;

    public String name;
    public String type;
    public int usersEnrolled;

    public Course() {}

    public Course(String id, String name, String type, int usersEnrolled) {
    	this.id = id;
        this.name = name;
        this.type = type;
        this.usersEnrolled = usersEnrolled;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', type='%s']",
                id, name, type);
    }

}

