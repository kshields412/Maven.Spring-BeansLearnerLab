package com.zipcode.beans.configs;

import com.zipcode.beans.models.classroom.Classroom;
import com.zipcode.beans.models.instructor.Instructors;
import com.zipcode.beans.models.student.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean("currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean("previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }
}
