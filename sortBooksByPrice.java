import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (sc.hasNextInt()) { 
            int id = sc.nextInt();
            sc.nextLine(); 

            if (!sc.hasNextLine()) break;
            String title = sc.nextLine();

            if (!sc.hasNextLine()) break;
            String author = sc.nextLine();
            
            if (!sc.hasNextDouble()) break;
            double price = sc.nextDouble();
            sc.nextLine(); 

            bookList.add(new Book(id, title, author, price));
        }
        sc.close(); 
        Book[] books = bookList.toArray(new Book[0]);

        
        books = sortBooksByPrice(books);

        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getTitle() + " | " + b.getAuthor() + " | $" + b.getPrice());
        }
    }

    public static Book[] sortBooksByPrice(Book[] books) {
        Arrays.sort(books, Comparator.comparingDouble(Book::getPrice)); 
        return books;
    }
}

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
