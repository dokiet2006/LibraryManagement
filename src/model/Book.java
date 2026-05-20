package model;

public class Book {
    private int book_id;
    private String book_name;
    private boolean status;

    public Book(String book_name) {
        this.book_name = book_name;
        this.status = true;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}