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
        int result = fs.calculateFine(3);

        if (result != 3 * FineService.FINE_PER_DAY) {
            throw new RuntimeException("Expected: 15000, but got: " + result);
        }
    }

    @Test
    void testFineZero() {
        FineService fs = new FineService();
        assertEquals(0, fs.calculateFine(0));
    }

    @Test
    void testFineNegative() {
        FineService fs = new FineService();
        int result = fs.calculateFine(-5);

        if (result != 0) {
            throw new RuntimeException("Expected: 0, but got: " + result);
        }
    }

}