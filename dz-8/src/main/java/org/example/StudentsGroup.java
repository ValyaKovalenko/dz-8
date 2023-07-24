package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.Student;
import java.util.ArrayList;
import java.util.List;

final public class StudentsGroup {
    private Student leaderGroup;
    final private List<Student> listStudents;
    final private List<String> listTasks;
    private Map<Student, List<String>> completedTasks;

    public StudentsGroup(Student leaderGroup) {
        this.leaderGroup = leaderGroup;
        this.listStudents = new ArrayList<>();
        this.listTasks = new ArrayList<>();
        this.completedTasks = new HashMap<>();
    }
    public void changeLeader(Student newLeaderGroup) { //змінити старосту
        leaderGroup = leaderGroup;
    };
    public void addStudent(Student student) { //додати студента,
        listStudents.add(student);
    };
    public void removeStudent(Student student) { //видалити студента,
        listStudents.remove(student);
    };
    public void addTaskForGroup(String task) { //додати завдання (для всієї групи)
        listTasks.add(task);
    };

    public void markTaskAsDone(Student student, String task) {
        System.out.println("Завдання \"" + task + "\" виконане студентом " + student.getFirstName() + " " + student.getLastName());
    }
}
