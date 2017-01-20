package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttendanceRepository extends MongoRepository<Attendance, String> {

    public List<Attendance> findByUserId(String userId);
    public List<Attendance> findByActivityId(String activityId);
}
