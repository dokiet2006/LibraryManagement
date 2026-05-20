package test;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

class BookServiceTest {

    @Test
    void addBookDuplicate() {
        BookService bs = new BookService();
        bs.addBook("Conan");
    }
    @Test
    void findBook() {
        BookService bs = new BookService();

        bs.addBook("Doraemon");

        Book b = bs.findBook(1);

        if (b == null) {
            throw new RuntimeException("Book is null");
        }
        if (!b.getBook_name().equals("Doraemon")) {
            throw new RuntimeException("Expected: Doraemon, but got: " + b.getBook_name());
        }
    }

    @Test
    void searchByName() {
        BookService bs = new BookService();

        bs.addBook("Doraemon");

        Book b = bs.searchByName("doraemon");

        if (b == null) {
            throw new RuntimeException("Book is null");
        }
    }
}