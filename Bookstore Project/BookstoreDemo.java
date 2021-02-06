/*
Author: Neil Patel
Date: 10/23/19
Course: CSC240_01
HomeWork Number: Lab03
Statement of Problem:
 */
import java.util.Scanner;

public class BookstoreDemo extends Bookstore {

    public static void main(String agrs[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(" *[][][][][][][][][][][]][][][][][][][][][][][][][][][][][][][][]*");
        System.out.println("[]                                                              []");
        System.out.println("[]                                                              []");
        System.out.println("[]                                                              []");
        System.out.println("[]\t\tWelcome to the Bookstore!!!                     []");
        System.out.println("[]                                                              []");
        System.out.println("[]                                                              []");
        System.out.println("[]                                                              []");
        System.out.println(" *[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]*"); 

        Bookstore user1 = new Bookstore();

        System.out.println("");
        System.out.println("\tHere are your options:");
        System.out.println("");
        System.out.println("1. Add a book to the stock \n2. Sell a book to the stock\n3. List of all titles of all the books in stock \n4. List all the information about the books in stock\n5. Print out the gross income of the Bookstore\n6. Quit");
        int menuItem = input.nextInt();

        if (menuItem == 1) {
            System.out.println("What is the title of the book?");
            String tit = input.next();
            if (user1.inStock(tit, 1)) {
                System.out.println("How many copies do you want to add?");
                int cop = input.nextInt();
                user1.addBookQuantity(tit, cop);
            } else {
                System.out.println("How many pages?");
                int pag = input.nextInt();
                System.out.println("What is the cost?");
                double money = input.nextDouble();
                System.out.println("How many copies?");
                int copy = input.nextInt();
                Book b1 = new Book(tit, pag, money, copy);
                user1.addNewBook(b1);
            }
        }

        if (menuItem == 2) {
            System.out.println("What is the title of the book?");
            String answer = input.next();
            if (user1.inStock(answer, 1)) {
                System.out.println("How many copies do you want?");
                int want = input.nextInt();

                if (user1.inStock(answer, want)) {
                    if (user1.sellBook(answer, want)) {
                        System.out.println("Okay transaction done!");
                    }
                } else {
                    System.out.println("Sorry we don't have enough copies.");
                }
            } else {
                System.out.println("Sorry but the book is not in stock");
            }
        }

        if (menuItem == 3) {

            user1.listTitles();
        }
        if (menuItem == 4) {
            user1.listBooks();
        }
        if (menuItem == 5) {
            user1.getIncome();
        }
        if (menuItem == 6) {
            System.exit(0);
        } else {
            System.out.println("ERROR you must choose between options 1-6");
            System.exit(0);
        }

    }//end of main method      
}
