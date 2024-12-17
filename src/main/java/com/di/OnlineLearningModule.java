package com.di;

import com.google.inject.AbstractModule;

public class OnlineLearningModule extends AbstractModule {
    @Override
    protected void configure() {
        // Зв'язуємо інтерфейс Course із його реалізацією OnlineCourse
        bind(Course.class).to(OnlineCourse.class);
    }
}
