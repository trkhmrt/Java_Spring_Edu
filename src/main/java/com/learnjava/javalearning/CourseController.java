package com.learnjava.javalearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"Leanr AWS","in 28 minutes"),
                new Course(2,"Learn Java","in 28 minutes"),
                new Course(3,"Learn Java","in 28 minutes"),
                new Course(4,"Learn Java","in 28 minutes"),
                new Course(5,"Learn Java","in 28 minutes"),
                new Course(5,"Learn Java","in 28 minutes")
        );
    }

}
