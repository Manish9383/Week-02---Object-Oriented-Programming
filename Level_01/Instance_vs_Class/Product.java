class Product {
    // Instance variables (unique to each instance of Product)
    private String productName;
    private double price;
    
    // Class variable (shared among all instances of Product)
    private static int totalProducts = 0;
    
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }
    
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
    
    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    
    public static void main(String[] args) {
        // Creating product instances
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 699.99);
        
        // Display details of each product
        p1.displayProductDetails();
        p2.displayProductDetails();
        
        // Display total number of products
        Product.displayTotalProducts();
    }
}
