package Model;

public class Book {
    private int book_id;
    private String book_name;
    private String author;
    private int quantity;

    public Book(int book_id, String book_name, String author, int quantity) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}