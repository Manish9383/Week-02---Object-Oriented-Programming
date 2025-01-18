public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class Variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main Method
    public static void main(String[] args) {
        // Update the institute name
        Course.updateInstituteName("Global Learning Institute");

        // Create Course objects
        Course course1 = new Course("Java Programming", 8, 500.0);
        Course course2 = new Course("Data Science", 12, 800.0);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
    }
}
