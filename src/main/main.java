package main;

import model.Book;
import service.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthService();
        BookService bookService = new BookService();
        BorrowService borrowService = new BorrowService();
        FineService fineService = new FineService();

        bookService.addBook(new Book(1, "Doraemon", true));
        bookService.addBook(new Book(2, "Conan", true));
        bookService.addBook(new Book(3, "Giáo trình Vật lý đại cương", true));

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        if(!auth.login(username, password)) {
            System.out.println("Login fail");
            return;
        }

        System.out.println("Login Success");
        bookService.showBook();

        System.out.println("Enter book ID:");
        int id = sc.nextInt();

        Book b = bookService.findBook(id);

        if(borrowService.borrowBook(b)) {
            System.out.println("Borrowing Success");
        } else {
            System.out.println("The book is finished");
        }

        bookService.showBook();
        System.out.println("Do you want to borrow more?");
        System.out.println("Yes/No ?");
        String reply = sc.next();
        if (reply.equalsIgnoreCase("No")) {
            System.out.println("Lượn");
        } else if (reply.equalsIgnoreCase("Yes")) {
            bookService.showBook();
            System.out.println("Enter book ID:");
            int id1 = sc.nextInt();

            Book b1 = bookService.findBook(id1);

            if(borrowService.borrowBook(b1)) {
                System.out.println("Borrowing Success");
            } else {
                System.out.println("The book is finished");
            }
        }
    }
}
