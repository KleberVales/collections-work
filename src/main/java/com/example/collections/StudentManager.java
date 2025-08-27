package com.example.collections;

import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }

    public void sortByGrade() {
        Collections.sort(students);
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
    }
}
