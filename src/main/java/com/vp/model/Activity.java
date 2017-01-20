package com.vp.model;

import org.springframework.data.annotation.Id;


public class Activity {

    @Id
    public String id;

    public String courseId;
    public String description;
    public String type;
    public int duration;

    public Activity() {}

    public Activity(String id, String courseId, String description, String type, int duration) {
        this.id = id;
    	this.courseId = courseId;
        this.description = description;
        this.type = type;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, courseId='%s', description='%s', type='%s']",
                id, courseId, description, type);
    }

}

