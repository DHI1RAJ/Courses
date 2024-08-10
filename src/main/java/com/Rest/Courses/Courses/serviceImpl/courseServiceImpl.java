package com.Rest.Courses.Courses.serviceImpl;

import com.Rest.Courses.Courses.Entities.Course;
import com.Rest.Courses.Courses.service.courseService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class courseServiceImpl implements courseService {

    List<Course> listCourse;

    public courseServiceImpl(){
        listCourse = Arrays.asList(
                new Course(1,"English","Language"),
                new Course(9,"History","Old Stories"),
                new Course(2,"Mathematics","Ramanujamam")
        );
    }

    @Override
    public List<Course> getAllCourses(){
        return listCourse;
    }

    @Override
    public Course getCourseById(long courseId){
        Course c=null;
        for(Course course: listCourse){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
}
