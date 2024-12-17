package com.di;

public abstract class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
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