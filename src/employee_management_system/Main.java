package employee_management_system;

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating Employee objects using polymorphism
        Employee emp1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Bob", 200, 25); // 25 hours * 200 per hour

        // Assigning departments
        ((Department) emp1).assignDepartment("HR");
        ((Department) emp2).assignDepartment("IT");

        // Display details
        System.out.println("Employee Details:\n");
        emp1.displayDetails();
        System.out.println(((Department) emp1).getDepartmentDetails());
        System.out.println("\n---------------------------\n");
        emp2.displayDetails();
        System.out.println(((Department) emp2).getDepartmentDetails());
    }
}
