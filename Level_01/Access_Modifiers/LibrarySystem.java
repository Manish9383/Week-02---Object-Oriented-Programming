
class Book {
    public String ISBN;        
    protected String title;    
    private String author;    

 
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

 
    public String getAuthor() {
        return author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

 
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class EBook extends Book {
    private double fileSize; 

    
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

   
    public void displayEBookDetails() {
        System.out.println("\nE-Book Details:");
        System.out.println("ISBN: " + ISBN);  
        System.out.println("Title: " + title); 
        System.out.println("File Size: " + fileSize + "MB");
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
  
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        book1.displayBookDetails();

    
        book1.setAuthor("J. Bloch");
        System.out.println("\nUpdated Author: " + book1.getAuthor());

  
        EBook ebook1 = new EBook("978-1491950357", "Clean Code", "Robert C. Martin", 5.2);
        ebook1.displayEBookDetails();
    }
}
