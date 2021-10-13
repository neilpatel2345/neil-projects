package bankTransaction;

import java.util.Scanner;

public class createABankAccount {

    Scanner input2 = new Scanner(System.in);
    private String username1, password1;
    protected int pinNumber1;
    protected String[] username = new String[100];
    protected String[] password = new String[100];
    protected int[] pinNumber = new int[100];
    protected int x = 0; 

    public createABankAccount() { 
        x++;
    }
    
    public void makeUserName() {
        System.out.println("What would you like your username to be?");
        System.out.print("Username: ");
        username1 = input2.next();
        username[x-1] = username1;
    }

    public void makePassword() {
        System.out.println("What would you want your password to be?");
        System.out.print("Password: ");
        password1 = input2.next();
        password[x-1] = password1;
    }

    public void makePinNumber() {
        System.out.println("What would you want your pin number to be?");
        System.out.print("Pin Number: ");
        pinNumber1 = input2.nextInt();
        pinNumber[x-1] = pinNumber1;
    }

//    public void moneyInput() {
//        System.out.println("\nHow much money are you going to put into the account? Minimun $5");
//        System.out.print("Amount: $");
//        firstMoney = input2.nextDouble();
//    }
}
