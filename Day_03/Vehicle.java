class Vehicle {
    private static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }

    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car", "CAR1234");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle", "BIKE5678");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();

        // Updating and displaying the registration fee
        System.out.println();
        Vehicle.updateRegistrationFee(6000.0);

        // Displaying updated details
        System.out.println();
        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
    }
}