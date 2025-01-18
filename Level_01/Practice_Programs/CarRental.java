// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.

class RentalSystem{
    String customerName;
    String carModel;
    int rentalDays;
    RentalSystem(){
        customerName = "Unknown";
        carModel = "Not Available";
        rentalDays = 0;
    }
    RentalSystem(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    RentalSystem(RentalSystem r){
        customerName = r.customerName;
        carModel = r.carModel;
        rentalDays = r.rentalDays;
    }
    void display(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Car Model: "+carModel);
        System.out.println("Rental Days: "+rentalDays);
    }
    void calculateCost(){
        int cost = 0;
        if(carModel.equals("Sedan")){
            cost = 1000;
        }
        else if(carModel.equals("SUV")){
            cost = 2000;
        }
        else if(carModel.equals("Luxury")){
            cost = 3000;
        }
        System.out.println("Total Cost: "+cost*rentalDays);
    }

}
public class CarRental{
    public static void main(String[] args){
        RentalSystem r1 = new RentalSystem("John", "Sedan", 3);
        RentalSystem r2 = new RentalSystem(r1);
        r1.display();
        r2.display();
        r1.calculateCost();
    }
}