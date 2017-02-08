package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vp.model.Course;
import com.vp.model.CourseRepository;

@Controller
public class CourseController {
	
	@Autowired
    private CourseRepository courseRepository;
	
	@RequestMapping(value = "/courses", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Course> getCourses() {
		List<Course> courses = courseRepository.findAll();
		return courses;
	}
}
