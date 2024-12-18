package com.di;

import java.util.List;

public class Teacher {
    private String name;
    private List<Student> students;  // Змінюємо на список студентів

    // Конструктор і геттери/сеттери для властивостей

    public void evaluateAssignment(Assignment assignment) {
        // Виконуємо оцінювання (додаємо метод evaluate, який існує в Assignment)
        assignment.evaluate(5); // Приклад виклику оцінки з рівнем 5
    }
}
