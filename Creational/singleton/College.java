package Creational.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class College {
    private static Map<String, College> instances = new HashMap<>();
    private String name;
    private List<String> enrolledStudents = new ArrayList<>();  

    private College(String name) {
        this.name = name;
    }

    public static synchronized College getInstance(String name) {
        if (!instances.containsKey(name)) {
            instances.put(name, new College(name));
        }
        return instances.get(name);
    }

    public void enrollStudent(String studentName) {
        System.out.println("Enrolling student " + studentName + " in " + name);
        enrolledStudents.add(studentName);
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public static void main(String[] args) {
        College college1 = College.getInstance("JNTU University");
        College college2 = College.getInstance("OU University");

        college1.enrollStudent("Student A");
        college1.enrollStudent("Student B");

        college2.enrollStudent("Student C");
        college2.enrollStudent("Student D");

        for (String collegeName : instances.keySet()) {
            College college = instances.get(collegeName);
            System.out.println("Enrolled Students in " + college.name + ": " + college.getEnrolledStudents());
        }
    }
}