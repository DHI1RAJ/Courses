package com.Rest.Courses.Courses.serviceImpl;

import com.Rest.Courses.Courses.Entities.Course;
import com.Rest.Courses.Courses.service.courseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class courseServiceImpl implements courseService {

    List<Course> listCourse;

    public courseServiceImpl(){
        listCourse = new ArrayList<>();
        listCourse.add(new Course(1,"English","Language"));
        listCourse.add(new Course(9,"History","Old Stories"));
        listCourse.add(new Course(2,"Mathematics","Ramanujamam"));

//        listCourse = Arrays.asList(
//                new Course(1,"English","Language"),
//                new Course(9,"History","Old Stories"),
//                new Course(2,"Mathematics","Ramanujamam")
//        );
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

    @Override
    public Course addCourse(Course course){
        listCourse.add(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        listCourse = this.listCourse.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }

    @Override
    public Course updateCourse(Course course) {
        listCourse.forEach(e -> {
            if (e.getId() == course.getId()) {
                e.setTittle(course.getTittle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }
}
