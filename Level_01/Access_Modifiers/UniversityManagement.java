
class Student {
    public int rollNumber;       
    protected String name;     
    private double CGPA;          


    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Please enter a value between 0 and 10.");
        }
    }


    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

   
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); 
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
    
        Student student1 = new Student(101, "Alice Johnson", 8.5);
        student1.displayStudentDetails();

        student1.setCGPA(9.2);
        System.out.println("\nUpdated CGPA: " + student1.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Williams", 8.9, "Artificial Intelligence");
        System.out.println("\n");
        pgStudent.displayPostgraduateDetails();
    }
}
