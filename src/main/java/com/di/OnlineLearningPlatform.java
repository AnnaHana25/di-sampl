package com.di;

import com.google.inject.Inject;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class OnlineLearningPlatform {

    @Inject
    private StudentDatabase studentDatabase;

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        OnlineLearningPlatform platform = injector.getInstance(OnlineLearningPlatform.class);

        platform.setup();
    }

    public void setup() {
        // Додаємо студента
        studentDatabase.addStudent("John Doe");
        studentDatabase.fetchStudents();
    }
}
