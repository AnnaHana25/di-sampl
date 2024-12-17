package com.di;

public class Assignment {
    private String title;
    private AssignmentStatus status;
    private Student student;
    private int grade;

    // Закоментований конструктор
    // public Assignment(String title) {
    //     this.title = title;
    //     this.status = AssignmentStatus.CREATED;
    // }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Метод для подання завдання
    public void submit(Student student) {
        this.student = student;
        this.status = AssignmentStatus.SUBMITTED;
        System.out.println("Assignment \"" + title + "\" submitted by student " + student.getName());
    }

    // Метод для оцінювання завдання
    public void evaluate(int grade) {
        this.grade = grade;
        this.status = grade >= 60 ? AssignmentStatus.PASSED : AssignmentStatus.FAILED;
        System.out.println("Assignment \"" + title + "\" graded with: " + grade);
    }

    // Геттери
    public String getTitle() {
        return title;
    }

    public AssignmentStatus getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }

    public int getGrade() {
        return grade;
    }

    // Enum для статусу завдання
    public enum AssignmentStatus {
        CREATED, SUBMITTED, PASSED, FAILED
    }
}
