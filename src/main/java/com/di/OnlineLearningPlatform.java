package com.di;

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        // Створення об'єктів користувачів
        Teacher teacher = new Teacher("Іван Петров", "ivan@school.com");
        Student student = new Student("Марія Іванова", "maria@school.com");
        
        // Створення курсу
        OnlineCourse javaCourse = new OnlineCourse("Основи Java");
        
        // Зміна назви курсу
        javaCourse.setCourseName("Java для початківців");
        
        // Додавання матеріалів
        javaCourse.addMaterial("Вступ до Java", true);
        javaCourse.addMaterial("ООП в Java");
        
        // Реєстрація студента на курс
        student.register();
        student.enrollCourse(javaCourse);
        
        // Створення та подання завдання
        Assignment assignment = new Assignment("Перша програма на Java");
        student.submitAssignment(assignment);
        
        // Оцінювання завдання
        teacher.evaluateAssignment(assignment, 85);
        
        // Логін користувачів
        teacher.login();
        student.login();
    }
}
