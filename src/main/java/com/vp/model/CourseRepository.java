package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

    public Course findByName(String name);
    public List<Course> findByType(String type);
}
