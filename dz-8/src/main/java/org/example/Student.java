package org.example;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттери та сеттери для полів, якщо потрібні
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}