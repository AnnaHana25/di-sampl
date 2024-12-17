package com.di;

public interface Course {
    void addMaterial(String material);
    void addMaterial(String material, boolean isImportant);
    void removeMaterial(String material);
}
