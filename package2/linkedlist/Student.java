package linkedlist;

import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int ID;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, int ID, String major,double gpa, String classStanding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
        this.courseList = new LinkedList<String>();
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public String getStudentInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nID: " + ID +
                "\nMajor: " + major +
                "\nClass Standing: " + classStanding +
                "\nGPA: " + gpa;
    }

    public void displayStudentCourses() {
        System.out.println(firstName + " " + lastName + "'s Course List:");
        for (String course : courseList) {
            System.out.println("- " + course);
        }
        System.out.println();
    }
}

