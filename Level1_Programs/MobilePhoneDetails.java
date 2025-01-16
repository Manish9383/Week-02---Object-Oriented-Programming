class MobilePhone{
    String brand;
    String model;
    int price;
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

}
public class MobilePhoneDetails{
    public static void main(String[] args){
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S21", 70000);
        m1.display();
    }
}