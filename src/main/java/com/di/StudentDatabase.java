package com.di;

import com.google.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDatabase {

    @Inject
    private Connection connection;

    public void addStudent(String name) {
        try {
            String query = "INSERT INTO students (name) VALUES (?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.executeUpdate();
            System.out.println("Student added: " + name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchStudents() {
        try {
            String query = "SELECT * FROM students";
            PreparedStatement stmt = connection.prepareStatement(query);
            var resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                System.out.println("Student: " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
