package com.di;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import java.sql.Connection;
import com.google.inject.Provides;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    @Singleton
    public Connection provideConnection() throws Exception {
        // Підключення до H2
        String url = "jdbc:h2:~/test";
        return java.sql.DriverManager.getConnection(url, "sa", "");
    }
}
