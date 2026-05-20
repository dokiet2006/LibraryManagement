package service;

import model.Book;
import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books = new ArrayList<>();

    public boolean addBook(Book newBook) {
        for (Book b : books) {
            if (b.getBook_id() == newBook.getBook_id()) {
                return false;
            }
        }
        books.add(newBook);
        return true;
    }

    public void showBook() {
        for (Book b : books) {
            System.out.println(b.getBook_id() + " - " + b.getBook_name() +
                            " | Status: " + (b.isStatus() ? "Available" : "Unavailable"));
        }
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getBook_id() == id) {
                return b;
            }
        }
        return null;
    }

    public Book searchByName(String name) {
        for (Book b : books) {
            if(b.getBook_name().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
}
