public class TaskSheet123 {
    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println("Title: "+ myBook.title);
        System.out.println("Author: "+ myBook.author);
        System.out.println("Year Published: "+ myBook.yearPublished);
        System.out.println("Price: $"+ myBook.price);
    }
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book() {
        title = "My Book";
        author = "Robin Louis";
        yearPublished = 2024;
        price = 12.99;
    }
}
