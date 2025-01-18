public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType; // e.g., "Car", "Bike", "Truck"

    // Class Variable
    private static double registrationFee = 1000.0; // Default fee for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class Method: Update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main Method
    public static void main(String[] args) {
        // Update the registration fee
        Vehicle.updateRegistrationFee(1500.0);

        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Alice Smith", "Bike");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
