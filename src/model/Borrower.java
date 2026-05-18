package model;

public class Borrower {
    private int borrower_id;
    private String borrower_name;

    public Borrower(String borrower_name, int borrower_id) {
        this.borrower_name = borrower_name;
        this.borrower_id = borrower_id;
    }
}
