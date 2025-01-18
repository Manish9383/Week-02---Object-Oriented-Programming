class Detail{
    String name;
    int age;
    String address;
    String phone;
    String email;
    Detail(){
        name = "Unknown";
        age = 0;
        address = "Not Available";
        phone = "Not Available";
        email = "Not Available";
    }
    Detail(String name, int age, String address, String phone, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    Detail(Detail d){
        name = d.name;
        age = d.age;
        address = d.address;
        phone = d.phone;
        email = d.email;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
    }

}
public class Person{
    public static void main(String[] args){
        Detail d1 = new Detail("John", 30, "123 Main St, New York, NY", "1234567890", "hello@gmail.com");
        Detail d2 = new Detail(d1);
        d1.display();
        d2.display();
    }
}