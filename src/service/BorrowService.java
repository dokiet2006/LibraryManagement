package service;

import model.Book;

public class BorrowService {
    public boolean borrowBook(Book b) {
        if (b != null &&  b.isStatus()) {
            b.setStatus(false);
            return true;
        }
        return false;
    }

    public void returnBook(Book b) {
        if (b != null) {
            b.setStatus(true);
        }
    }
}
