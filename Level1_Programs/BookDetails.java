class Book{
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
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
public class BookDetails{
    public static void main(String[] args){
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        b1.display();
    }
}