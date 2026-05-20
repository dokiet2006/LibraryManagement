package test;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BorrowService;

class BorrowServiceTest {
    @Test
    void testBorrowSuccess() {
        Book b = new Book(1,"Doraemon", true);
        BorrowService service = new BorrowService();

        boolean result = service.borrowBook(b);

        if (!result) {
            throw new RuntimeException("Expected true");
        }

        if (b.isStatus()) {
            throw new RuntimeException("Expected false after borrowing");
        }
    }

    @Test
    void testBorrowFail() {
        Book b = new Book(1,"Doraemon",false);
        BorrowService service =  new BorrowService();

        boolean result = service.borrowBook(b);

        if (result) {
            throw new RuntimeException("Expected true but got false");
        }
    }

    @Test
    void testReturnBook() {
        Book b = new Book(1,"Doraemon",false);
        BorrowService service = new BorrowService();

        service.returnBook(b);

        if (!b.isStatus()) {
            throw new RuntimeException("Expected true after return");
        }
    }
}