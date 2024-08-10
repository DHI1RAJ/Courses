package com.Rest.Courses.Courses.controller;

import com.Rest.Courses.Courses.Entities.Course;
import com.Rest.Courses.Courses.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class myController {

    @Autowired
    private courseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is home Page";
    }
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourseById(Long.parseLong(courseId));
    }
}
