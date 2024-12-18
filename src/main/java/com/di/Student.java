package com.di;

public class Student {

    private String name;

    // Конструктор для ініціалізації студента з ім'ям
    public Student(String name) {
        this.name = name;
    }

    // Геттер для отримання імені студента
    public String getName() {
        return name;
    }

    // Метод для здачі завдання
    public void submitAssignment(String assignment) {
        System.out.println(name + " has submitted assignment: " + assignment);
    }
}
