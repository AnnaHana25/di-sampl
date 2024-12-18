package com.di;

public class Assignment {
    private String name;

    // Оцінка завдання
    public void evaluate(int score) {
        System.out.println("The assignment " + name + " is graded: " + score);
    }
}
