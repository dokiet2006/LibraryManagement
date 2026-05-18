package service;

public class FineService {
    private final int FINE_PER_DAY = 5000;

    public int calculateFine(int days) {
        if (days <= 0) {
            return 0;
        }

        return days * FINE_PER_DAY;
    }
}
