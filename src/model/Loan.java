package model;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Loan(Book book, Borrower borrower, LocalDate borrowDate, LocalDate dueDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }
}
