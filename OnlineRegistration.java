package program4;
class Course {
    String name;
    int marks;
    int rollno;

    Course(String name, int marks ,int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }
}

class Student {
    String name = "Ravi";
    String program = "BCA";
    int semester = 4;

    Course[] courses = {
        new Course("Math", 35,11),
        new Course("Java", 75,12),
        new Course("English", 30,13)
    };

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println("  - " + c.name);
        }
    }

    void displayLowMarks() {
        System.out.println("\nCourses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println("  " + c.name + ": " + c.marks);
            }
        }
    }
}
public class OnlineRegistration {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayLowMarks();
    }
}