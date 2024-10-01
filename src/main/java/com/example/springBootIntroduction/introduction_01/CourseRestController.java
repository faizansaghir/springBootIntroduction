package com.example.springBootIntroduction.introduction_01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseRestController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
          new Course(1, "C1", "Author 1"),
                new Course(2, "Course 2", "A2"),
                new Course(3, "Course 3", "Author 3")
        );
    }

}
