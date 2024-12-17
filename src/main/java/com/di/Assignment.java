package com.di;

public class Assignment {
    private String title;
    private AssignmentStatus status;
    private Student student;
    private int grade;

    public Assignment(String title) {
        this.title = title;
        this.status = AssignmentStatus.CREATED;
    }

    public void submit(Student student) {
        this.student = student;
        this.status = AssignmentStatus.SUBMITTED;
        System.out.println("Завдання \"" + title + "\" подане студентом " + student.getName());
    }

    public void evaluate(int grade) {
        this.grade = grade;
        this.status = grade >= 60 ? AssignmentStatus.PASSED : AssignmentStatus.FAILED;
        System.out.println("Завдання \"" + title + "\" оцінене на " + grade + " балів");
    }

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

    // Enum для статусів завдання
    public enum AssignmentStatus {
        CREATED, SUBMITTED, PASSED, FAILED
    }
}