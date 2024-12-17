package com.di;

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        // Створення об'єктів користувачів
        Teacher teacher = new Teacher();
        teacher.setName("Ivan Petrov");
        teacher.setEmail("ivan@school.com");

        Student student = new Student();
        student.setName("Maria Ivanova");
        student.setEmail("maria@school.com");

        Administrator admin = new Administrator();
        admin.setName("Olena Sidorova");
        admin.setEmail("olena@school.com");

        // Створення курсу
        OnlineCourse javaCourse = new OnlineCourse("Java Basics");
        javaCourse.addMaterial("Intro to Java", true);
        javaCourse.addMaterial("OOP in Java");

        // Реєстрація студента
        student.register();
        
        // Студент записується на курс
        student.enrollCourse(javaCourse);

        // Створення та подання завдання
        Assignment assignment = new Assignment();
        assignment.setTitle("First Java Program");
        student.submitAssignment(assignment);

        // Викладач оцінює завдання
        teacher.evaluateAssignment(assignment, 85);

        // Логін користувачів
        teacher.login();
        student.login();
        admin.login();

        // Генерація звіту адміністратором
        admin.generateReport(javaCourse);
    }
}
