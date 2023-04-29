package linkedlist;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jeffrey", "Baxter", 45352, "Construction Management",3.0, "Senior");
        Student student2 = new Student("Betsy", "Smith", 67578, "Com Sci",4.2, "Junior");

        student1.addCourse("Building Stuff I");
        student1.addCourse("Managing Stuff I");
        student1.addCourse("Whatever Construction Managers Do I");

        student2.addCourse("Java I");
        student2.addCourse("Python II");
        student2.addCourse("CS121");

        System.out.println(student1.getStudentInfo());
        student1.displayStudentCourses();
        System.out.println(student2.getStudentInfo());
        student2.displayStudentCourses();

        student1.removeCourse("Building Stuff I");
        student2.removeCourse("CS121");

        student1.displayStudentCourses();
        student2.displayStudentCourses();
    }
}

