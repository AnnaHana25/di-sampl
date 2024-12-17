package com.di;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<OnlineCourse> teachingCourses;

    public Teacher(String name, String email) {
        super(name, email);
        this.teachingCourses = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println("Викладач " + getName() + " увійшов у систему");
    }

    public OnlineCourse createCourse(String courseName) {
        OnlineCourse course = new OnlineCourse(courseName);
        teachingCourses.add(course);
        return course;
    }

    public void evaluateAssignment(Assignment assignment, int grade) {
        assignment.evaluate(grade);
    }

    public List<OnlineCourse> getTeachingCourses() {
        return teachingCourses;
    }
}