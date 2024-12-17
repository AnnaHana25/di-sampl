package com.di;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse implements Course {
    private String courseName;
    private List<String> materials;
    private List<Student> enrolledStudents;

    public OnlineCourse(String courseName) {
        this.courseName = courseName;
        this.materials = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    // Додати метод для зміни назви курсу
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Решта методів залишаються незмінними...
    @Override
    public void addMaterial(String material) {
        materials.add(material);
        System.out.println("Додано матеріал: " + material + " до курсу " + courseName);
    }

    @Override
    public void addMaterial(String material, boolean isImportant) {
        addMaterial(material);
        if (isImportant) {
            System.out.println("Позначено як важливий матеріал");
        }
    }

    @Override
    public void removeMaterial(String material) {
        materials.remove(material);
        System.out.println("Видалено матеріал: " + material + " з курсу " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " записаний на курс " + courseName);
    }

    public List<String> getMaterials() {
        return materials;
    }
}
