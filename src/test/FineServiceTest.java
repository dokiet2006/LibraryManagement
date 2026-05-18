package test;

import org.junit.jupiter.api.Test;
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
}