package com.di;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<OnlineCourse> teachingCourses;

    // Пустий конструктор
    public Teacher() {
        this.teachingCourses = new ArrayList<>();
    }

    // Сеттер для ім'я
    public void setName(String name) {
        super.setName(name);
    }

    // Сеттер для email
    public void setEmail(String email) {
        super.setEmail(email);
    }

    public void setTeachingCourses(List<OnlineCourse> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    // Реалізація абстрактного методу login()
    @Override
    public void login() {
        System.out.println("Teacher " + getName() + " logged in.");
    }

    // Метод для створення нового курсу
    public OnlineCourse createCourse(String courseName) {
        OnlineCourse course = new OnlineCourse(courseName);
        teachingCourses.add(course);
        return course;
    }

    // Метод для оцінювання завдання
    public void evaluateAssignment(Assignment assignment, int grade) {
        assignment.evaluate(grade);
    }

    public List<OnlineCourse> getTeachingCourses() {
        return teachingCourses;
    }
}
