package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity, String> {

    public Activity findByDescription(String description);
    public List<Activity> findByType(String Type);
}
