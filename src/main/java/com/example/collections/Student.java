package com.example.collections;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Ordenação padrão: pela nota (decrescente)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.grade, this.grade);
    }

    @Override
    public String toString() {
        return name + " - Grade: " + grade;
    }
}
