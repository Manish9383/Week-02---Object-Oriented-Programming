import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String rollNumber;
    private ArrayList<Course> courseList;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.courseList = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courseList;
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    public void displayStudent() {
        System.out.println("Student name - " + name + "\nRoll number - " + rollNumber);
    }
}

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }

    public void displayCourse() {
        System.out.println("Course name - " + courseName);
        System.out.println("Enrolled students:");
        for (Student student : enrolledStudents) {
            student.displayStudent();
        }
    }
}

class School {
    private String schoolName;
    private List<Student> studentList;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student, Course course) {
        studentList.add(student);
        course.enrollStudent(student);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school1 = new School("TIT BHOPAL");
        
        Course course1 = new Course("Computer Network");
        Course course2 = new Course("TOC");
        Course course3 = new Course("Database");
        
        Student student1 = new Student("MANISH", "28");
        Student student2 = new Student("RAJ", "41");

        school1.addStudent(student1, course1);
        school1.addStudent(student1, course2);
        school1.addStudent(student2, course3);
        
        course1.displayCourse();
        course2.displayCourse();
        course3.displayCourse();
    }
}
