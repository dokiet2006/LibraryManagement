package test;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BorrowService;
import service.FineService;

import static org.junit.jupiter.api.Assertions.*;

class FineServiceTest {

    @Test
    void testFineNormal() {
        FineService fs = new FineService();
        assertEquals(15000, fs.calculateFine(3));
    }

    @Test
    void testFineZero() {
        FineService fs = new FineService();
        assertEquals(0, fs.calculateFine(0));
    }

    @Test
    void testFineNegative() {
        FineService fs = new FineService();
        assertEquals(0, fs.calculateFine(-5));
    }

    static class BorrowServiceTest {
        @Test
        void testBorrowSuccess() {
            Book b = new Book(1,"Doraemon",10);
            BorrowService service = new BorrowService();

            boolean result = service.borrowBook(b);

            if (result != true) {
                throw new RuntimeException("Expected true but got false");
            }

            if (b.getQuantity() != 9) {
                throw new RuntimeException("Expected: 10, but got: " + b.getQuantity());
            }
        }

        @Test
        void testBorrowFail() {
            Book b = new Book(1,"Doraemon",0);
            BorrowService service =  new BorrowService();

            boolean result = service.borrowBook(b);

            if (result != false) {
                throw new RuntimeException("Expected true but got false");
            }
        }

        @Test
        void testReturnBook() {
            Book b = new Book(1,"Doraemon",2);
            BorrowService service = new BorrowService();

            service.returnBook(b);

            if (b.getQuantity() != 3) {
                throw new RuntimeException("Expected: 3, but got: " + b.getQuantity());
            }
        }
    }
}