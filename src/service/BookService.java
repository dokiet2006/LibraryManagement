package service;

import model.Book;
import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books = new ArrayList<>();

    public boolean addBook(String bookName) {
        for (Book b : books) {
            if (b.getBook_name().equalsIgnoreCase(bookName)) {
                return false;
            }
        }
        Book newBook = new Book(bookName);

        int newBook_id = 1;
        if (!books.isEmpty()) {
            newBook_id = books.get(books.size() - 1).getBook_id() + 1;
        }

        newBook.setBook_id(newBook_id);
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
