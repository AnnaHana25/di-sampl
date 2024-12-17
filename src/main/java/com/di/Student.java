package com.di;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<OnlineCourse> courses;
    private List<Assignment> assignments;

    // Пустий конструктор
    public Student() {
        this.courses = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    // Сеттер для ім'я
    public void setName(String name) {
        super.setName(name);
    }

    // Сеттер для email
    public void setEmail(String email) {
        super.setEmail(email);
    }

    // Сеттер для курсів
    public void setCourses(List<OnlineCourse> courses) {
        this.courses = courses;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    // Логін
    @Override
    public void login() {
        System.out.println("Student " + getName() + " logged in.");
    }

    // Запис на курс
    public void enrollCourse(OnlineCourse course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Подання завдання
    public void submitAssignment(Assignment assignment) {
        assignments.add(assignment);
        assignment.submit(this);
    }
}
