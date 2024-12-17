package com.di;

public class Administrator extends User {

    // // Пустий конструктор
    // public Administrator() {
    //     super("", "");
    // }

    // Сеттер для ім'я
    public void setName(String name) {
        super.setName(name);
    }

    // Сеттер для email
    public void setEmail(String email) {
        super.setEmail(email);
    }

    // Логін
    @Override
    public void login() {
        System.out.println("Administrator " + getName() + " logged in.");
    }

    // Генерація звіту по курсу
    public void generateReport(OnlineCourse course) {
        System.out.println("Report for course: " + course.getCourseName());
        System.out.println("Materials: " + course.getMaterials());
    }
}
