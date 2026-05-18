package Model;

public class Loan {
    private Book book;
    private Borrower borrower;
    private String borrowDate;
    private String dueDate;

    public Loan(Book book, Borrower borrower, String borrowDate, String dueDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }
}
