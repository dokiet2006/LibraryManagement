package Service;

import Model.Book;

public class BorrowService {
    public boolean borrowBook(Book b) {
        if (b != null && b.getQuantity() > 0) {
            b.setQuantity(b.getQuantity() - 1);
            return true;
        }
        return false;
    }

    public void returnBook(Book b) {
        if (b != null) {
            b.setQuantity(b.getQuantity() + 1);
        }
    }
}
