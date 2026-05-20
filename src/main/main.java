package main;

import model.Book;
import service.*;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthService();
        BookService bookService = new BookService();
        BorrowService borrowService = new BorrowService();
        FineService fineService = new FineService();

        bookService.addBook("Doraemon");
        bookService.addBook("Conan");
        bookService.addBook("Boku no Pico");

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        if (!auth.login(username, password)) {
            System.out.println("Login fail");
            return;
        }

        System.out.println("Login Success");
        bookService.showBook();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add book");
            System.out.println("2. Borrow book");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String newBook = sc.nextLine();

                    if (bookService.addBook(newBook)) {
                        System.out.println("Add book success");
                    } else {
                        System.out.println("Book already exists");
                    }
                    break;

                case 2:
                    bookService.showBook();

                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();

                    Book b = bookService.findBook(id);

                    if (borrowService.borrowBook(b)) {
                        System.out.println("Borrow success");
                        System.out.println("Borrow Date: " + LocalDate.now());
                    } else {
                        System.out.println("Book unavailable");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
            bookService.showBook();
        }
    }
}