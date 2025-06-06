public class Book {
    String title;
    String author;
    int pages;

    // Constructor 1: No parameters
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;
    }

    // Constructor 2: Title and author only
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 100;  // default pages
    }

    // Constructor 3: All fields
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", 310);

        b1.display();
        b2.display();
        b3.display();
    }
}
