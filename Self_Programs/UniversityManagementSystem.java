import java.util.ArrayList;
import java.util.List;
class Professor{
    private String professorName;
    private Course assignedCourse;

    public Professor(String professorName){
        this.professorName = professorName;
    }
    public void displayProfessor(){
        System.out.println("Professor name - " + professorName);
        assignedCourse.displayCourse();
    }
    public String getName(){
        return professorName;
    }
}
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> studentsList;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void displayStudentDetials() {
        this.displayCourse();
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }
    public void displayCourse() {
        System.out.println("\ncourse name - " + courseName +
                "\ncourse professer - " + professor.getName());
    }
}
class Student {
    private String studentName;
    private int rollNumber;
    private List<Course> coursesList;

    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        coursesList = new ArrayList<>();
    }

    public void displayStudent() {
        System.out.println("Student name - " + studentName +
                "\nStudent roll number - " + rollNumber);
    }

    public void displayCourseDetails() {
        this.displayStudent();
        for (Course course : coursesList) {
            course.displayCourse();
        }
    }
    public void enrollCourse(Course course){
        coursesList.add(course);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor JyotiMam = new Professor("Dr. Sumit Vashishth");
        Professor tyagiSir = new Professor("Dr. Vivek Sharma");
        Professor kavitamam = new Professor("Dr. Aadarsh verma");


        Course oopCourse = new Course("Object Oriented Programming");
        Course dbmsCourse = new Course("Dababase Managment System");
        Course cnCourse = new Course("Computer Network");

        Student manishStudent = new Student("ROHAN Kajle", 8);
        Student karanstudent = new Student("RIYA Yadav", 4);
        Student manuStudent = new Student("MANISH", 28);

        cnCourse.assignProfessor(JyotiMam);
        dbmsCourse.assignProfessor(tyagiSir);
        oopCourse.assignProfessor(kavitamam);

        manishStudent.enrollCourse(cnCourse);
        manishStudent.enrollCourse(oopCourse);
        karanstudent.enrollCourse(oopCourse);
        karanstudent.enrollCourse(dbmsCourse);
        manuStudent.enrollCourse(dbmsCourse);
        manuStudent.enrollCourse(cnCourse);
        
        cnCourse.addStudent(manishStudent);
        oopCourse.addStudent(manishStudent);
        cnCourse.addStudent(manuStudent);
        dbmsCourse.addStudent(manuStudent);
        dbmsCourse.addStudent(karanstudent);
        oopCourse.addStudent(karanstudent);
        
        cnCourse.displayStudentDetials();
        oopCourse.displayStudentDetials();
        dbmsCourse.displayStudentDetials();
    }
}
