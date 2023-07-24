
package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Will", "Smith");
        Student student2 = new Student(2, "Jane", "Brown");
        Student student3 = new Student(3, "Bob", "Johnson");

        StudentsGroup group = new StudentsGroup(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        group.addTaskForGroup("Вивчити інкапсуляцію");
        group.markTaskAsDone(student1, "Вивчити інкапсуляцію");
        group.changeLeader(student2);

        System.out.println("Cтудент " + student2.getFirstName() + " " + student2.getLastName()+ " новий староста групи");
    }
}