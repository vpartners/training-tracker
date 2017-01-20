package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTrackingRepository extends MongoRepository<UserTracking, String> {

    public List<UserTracking> findByUserId(String userId);
    public List<UserTracking> findByPeriod(String period);
}
