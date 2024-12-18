package com.di;

import java.sql.Connection;
import com.google.inject.Singleton;

@Singleton
public class ConnectionProvider {

    private Connection connection;

    public Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            // Підключення до бази даних
            connection = java.sql.DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        }
        return connection;
    }
}
