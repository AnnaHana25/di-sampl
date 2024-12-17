package com.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        // Створення Injector для Google Guice
        Injector injector = Guice.createInjector(new OnlineLearningModule());

        // Отримання екземплярів з інжектора
        OnlineCourse javaCourse = injector.getInstance(OnlineCourse.class);
        Administrator admin = injector.getInstance(Administrator.class);

        // Налаштування курсу
        javaCourse.setCourseName("Основи Java");
        javaCourse.addMaterial("Вступ до Java");
        javaCourse.addMaterial("ООП в Java", true);

        // Генерація звіту
        admin.generateReport(javaCourse);

        // Логін адміністратора
        admin.login();
    }
}
