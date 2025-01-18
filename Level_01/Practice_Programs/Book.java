class Books{
    private String title;
    private String author;
    private int price;
    Books(){
        title = "Java";
        author = "Herbert Schildt";
        price = 500;
    }
    Books(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
   
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Book{
    public static void main(String[] args){
        Books b1 = new Books("C++", "Balaguruswamy", 400);
        Books b2 = new Books();
        b1.display();
        b2.display();
    }
}