package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FineService {
    public static final int FINE_PER_DAY = 5000;

    public int calculateFine(LocalDate dueDate, LocalDate returnDate) {
        long diff = ChronoUnit.DAYS.between(dueDate, returnDate);

        if (diff <= 0) {
            return 0;
        }
        return (int)diff * FINE_PER_DAY;
    }
}
