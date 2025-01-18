class Circle {
    private double radius;

    // Default constructor, sets radius to 1.0
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor to set user-defined radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle Radius: " + customCircle.getRadius());
    }
}
