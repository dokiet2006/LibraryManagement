package test;

import org.junit.jupiter.api.Test;
import service.FineService;

import java.time.LocalDate;

class FineServiceTest {

    @Test
    void testFineNormal() {
        FineService fs = new FineService();

        LocalDate dueDate = LocalDate.of(2026,5,20);
        LocalDate returnDate = LocalDate.of(2026,5,23);
        int result = fs.calculateFine(dueDate, returnDate);

        if (result != 3 * FineService.FINE_PER_DAY) {
            throw new RuntimeException("Expected: 15000");
        }
    }

    @Test
    void testFineZero() {
        FineService fs = new FineService();

        LocalDate returnDate = LocalDate.of(2026,5,20);
        LocalDate dueDate = LocalDate.of(2026,5,23);
        int result = fs.calculateFine(dueDate, returnDate);

        if (result != 0) {
            throw new RuntimeException("Expected: 0");
        }
    }

    @Test
    void testFineEarlyReturne() {
        FineService fs = new FineService();

        LocalDate dueDate = LocalDate.of(2026,5,20);
        LocalDate returnDate = LocalDate.of(2026,5,18);
        int result = fs.calculateFine(dueDate, returnDate);

        if (result != 0) {
            throw new RuntimeException("Expected: 0");
        }
    }
}