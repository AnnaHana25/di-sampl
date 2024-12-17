package com.di;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class OnlineCourse implements Course {
    private String courseName;
    private List<String> materials;

    @Inject
    public OnlineCourse() {
        this.courseName = "Unnamed Course";
        this.materials = new ArrayList<>();
    }

    public OnlineCourse(String courseName) {
        this.courseName = courseName;
        this.materials = new ArrayList<>();
    }

    @Override
    public void addMaterial(String material) {
        materials.add(material);
        System.out.println("Додано матеріал: " + material + " до курсу " + courseName);
    }

    @Override
    public void addMaterial(String material, boolean isImportant) {
        addMaterial(material); // Викликаємо базовий метод
        if (isImportant) {
            System.out.println("Матеріал \"" + material + "\" позначено як важливий.");
        }
    }

    @Override
    public void removeMaterial(String material) {
        if (materials.remove(material)) {
            System.out.println("Видалено матеріал: " + material + " з курсу " + courseName);
        } else {
            System.out.println("Матеріал \"" + material + "\" не знайдено у курсі " + courseName);
        }
    }

    public List<String> getMaterials() {
        return materials;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
