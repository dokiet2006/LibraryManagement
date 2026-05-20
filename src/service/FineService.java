package service;

public class FineService {
    public static final int FINE_PER_DAY = 5000;

    public int calculateFine(int days) {
        if (days <= 0) {
            return 0;
        }

        return days * FINE_PER_DAY;
    }
}
