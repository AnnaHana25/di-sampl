package com.di;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse implements Course {
    private String courseName;
    private List<String> materials;
    private List<Student> enrolledStudents;

    // No-argument constructor
    public OnlineCourse() {
        this.materials = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    // Constructor with courseName (existing constructor)
    public OnlineCourse(String courseName) {
        this.courseName = courseName;
        this.materials = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    // Setter methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // Implemented methods
    @Override
    public void addMaterial(String material) {
        materials.add(material);
        System.out.println("Added material: " + material + " to course " + courseName);
    }

    @Override
    public void removeMaterial(String material) {
        materials.remove(material);
        System.out.println("Removed material: " + material + " from course " + courseName);
    }

    // Overloaded addMaterial method
    public void addMaterial(String material, boolean isImportant) {
        addMaterial(material);
        if (isImportant) {
            System.out.println("Marked as important material");
        }
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in course " + courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<String> getMaterials() {
        return materials;
    }
}
