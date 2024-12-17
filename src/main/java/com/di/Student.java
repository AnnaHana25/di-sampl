package com.di;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<OnlineCourse> courses;
    private List<Assignment> assignments;

    public Student(String name, String email) {
        super(name, email);
        this.courses = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println("Студент " + getName() + " увійшов у систему");
    }

    public void enrollCourse(OnlineCourse course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Метод для подання завдання
    public void submitAssignment(Assignment assignment) {
        assignments.add(assignment);
        assignment.submit(this);
    }

    public List<OnlineCourse> getCourses() {
        return courses;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
