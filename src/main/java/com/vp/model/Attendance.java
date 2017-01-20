package com.vp.model;

import org.springframework.data.annotation.Id;


public class Attendance {

    @Id
    public String id;

    public String userId;
    public String activityId;
    public boolean attendance;

    public Attendance() {}

    public Attendance(String id, String userId, String activityId, boolean attendance) {
        this.id = id;
    	this.userId = userId;
        this.activityId = activityId;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, userId='%s', activityId='%s']",
                id, userId, activityId);
    }

}

