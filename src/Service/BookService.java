package Service;

import Model.Book;
import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBook() {
        for (Book b : books) {
            System.out.println(b.getBook_id() + " - " + b.getBook_name() + " - "
                                + "|Quantity : " + b.getQuantity());
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
