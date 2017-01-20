package com.vp.model;

import org.springframework.data.annotation.Id;


public class UserTracking {

    @Id
    public String id;

    public String userId;
    public int trainingTimeAvailable;
    public int timeConsumed;
    public String period;

    public UserTracking() {}

    public UserTracking(String id, String userId, int trainingTimeAvailable, int timeConsumed, String period) {
        this.id = id;
    	this.userId = userId;
        this.trainingTimeAvailable = trainingTimeAvailable;
        this.timeConsumed = timeConsumed;
        this.period = period;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, userId='%s', period='%s']",
                id, userId, period);
    }

}

