package com.di;

import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class OnlineLearningModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(OnlineCourse.class).to(OnlineCourse.class).in(Singleton.class);
    }

    // Використовуємо List<Student> для створення OnlineCourse
    @Provides
    @Singleton
    public OnlineCourse provideOnlineCourse(List<Student> students) {
        return new OnlineCourse(students);
    }
}
