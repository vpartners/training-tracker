package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {

    public List<Enrollment> findByUserId(String userId);
    public List<Enrollment> findByCourseId(String courseId);
}
