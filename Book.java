/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neilpatel2345
 */

public class Book {

    private String title;
    private int numOfPages;
    private double price;
    private int quantity;

    public Book(String thetitle, int pages, double cost, int num) {
        title = thetitle;
        numOfPages = pages;
        price = cost;
        quantity = num; 
    }//end of constructor 

    public String getTitle() { 

        return title;
    }//end of method

    public double getPrice() {

        return price;
    }//end of method

    public int getQuantity() {

        return quantity;
    }//end of method

    @Override
    public String toString() {
        String answer = ("The title of the book: " + title + ".The number of pages: " + numOfPages + ". The cost of the book: " + price + ". The amount of copies we have: " + quantity + ".");
        return answer;
    }//end of method

    public void subtractQuantity(int amount) {
        int a = amount;
        for (int x = 0; x < a; x++) {
            quantity--;
        }
    }//end of method

    public void addQuantity(int amount) {
        int a = amount;
        for (int x = 0; x < a; x++) {
            quantity++;
        }
    }//end of method 

}//end of class
