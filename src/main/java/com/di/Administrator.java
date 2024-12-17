package com.di;

import com.google.inject.Inject;

public class Administrator extends User {

    @Inject
    public Administrator(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println("Адміністратор " + getName() + " увійшов у систему");
    }

    public void generateReport(OnlineCourse course) {
        System.out.println("Звіт по курсу: " + course.getCourseName());
        System.out.println("Матеріали курсу: " + course.getMaterials());
    }
}
