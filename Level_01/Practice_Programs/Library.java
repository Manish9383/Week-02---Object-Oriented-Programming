
class BookSystem{
    String titile;
    String author;
    int price;
    String availability;
    BookSystem(){
        titile = "Java";
        author = "Herbert Schildt";
        price = 500;
        availability = "Available";
    }
    BookSystem(String titile, String author, int price, String availability){
        this.titile = titile;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    void display(){
        System.out.println("Title: "+titile);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability: "+availability);
    }
    void borrow(){
        if(availability.equals("Available")){
            availability = "Not Available";
            System.out.println("Book Borrowed Successfully");
        }
        else{
            System.out.println("Book Not Available");
        }
    }


}
public class Library{
    public static void main(String[] args){
        BookSystem b1 = new BookSystem("C++", "Balaguruswamy", 400, "Available");
        BookSystem b2 = new BookSystem();
        b1.display();
        b2.display();
        System.out.println("Borrowing Book");
        b1.borrow();
        b1.display();
    }
}