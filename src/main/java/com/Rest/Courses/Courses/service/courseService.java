package com.Rest.Courses.Courses.service;

import com.Rest.Courses.Courses.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface courseService {
    List<Course>getAllCourses();
    public Course getCourseById(long courseId);
    public Course addCourse(Course course);
    void deleteCourse(long parseLong);

    public Course updateCourse(Course course);
}
