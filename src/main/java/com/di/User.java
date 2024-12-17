package com.di;

public abstract class User {
    private String name;
    private String email;

    // Закоментований конструктор
    /*
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    */

    // Setter методи для встановлення залежностей
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void login();

    // Фінальний метод реєстрації
    public final void register() {
        System.out.println("Користувач " + name + " зареєстрований");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
