package com.di;

import java.util.List;

public class OnlineCourse {
    private String courseName;
    private List<Student> students;  // Додано змінну students
    private List<String> materials;

    // Конструктор, який приймає список студентів
    public OnlineCourse(List<Student> students) {
        this.students = students;
        this.materials = materials;
    }

    // Геттери
    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getMaterials() {
        return materials;
    }

    // public OnlineCourse(List<Student> students) {
    //     this.students = students;
    // }

    public void assignTasks() {
        for (Student student : students) {
            // Використовуємо getName, щоб отримати ім'я студента
            System.out.println("Assigning task to: " + student.getName());
        }
    }
}
