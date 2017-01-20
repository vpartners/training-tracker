package com.vp.model;

import org.springframework.data.annotation.Id;


public class Enrollment {

    @Id
    public String id;

    public String userId;
    public String courseId;

    public Enrollment() {}

    public Enrollment(String id, String userId, String courseId) {
        this.id = id;
    	this.userId = userId;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, userId='%s', courseId='%s']",
                id, userId, courseId);
    }

}

