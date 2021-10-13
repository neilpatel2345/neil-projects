package bankTransaction;

import java.util.Scanner;

public class bankTransaction extends createABankAccount implements bankInterface {
//fields
    private String userName, userPassword;
    private static long userAccNumber;

    private final long accNumber;
    private int pNumber;
    
    private static int choice;
    private int checker = 0;
    private double money, firstMoney;

    Scanner input = new Scanner(System.in);
    static createABankAccount np = new createABankAccount();
//---------------------------CONSTRUCTOR---------------------------------
    public bankTransaction(long aNum) {
        super();
        accNumber = aNum;
    }
//----------------------------MENU list-----------------------------------
    public static void menu() {
        System.out.println("\n1. Check how much money is in your account");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdrawl money");
        System.out.println("4. Exit");
    }

    
    @Override
    public void accountUser() {
        System.out.println("\nLogin");
        System.out.print("\tUsername: ");
        userName = input.next();
    }

    @Override
    public void accountPassword() {
        System.out.print("\tPassword: ");
        userPassword = input.next();
    }

    @Override
    public long accountNumber() {
        System.out.print("\nhint: 123456789\n\tAccount Number: ");
        userAccNumber = input.nextLong();
        return userAccNumber;
    }

    @Override
    public int accountPinNumber() {
        System.out.print("\tPin Number: ");
        pNumber = input.nextInt();
        return pNumber;
    }
//--------------ASKS for the initial money input into the account-----------------------    
    public void moneyInput() {
        System.out.println("\nHow much money are you going to put into the account?");
        System.out.print("Amount: $");
        firstMoney = input2.nextDouble();
        money = firstMoney;
    }

//-----------------------BANK account functions----------------------    
    @Override
    public String moneyInAccount() {
        if (checker != 0) {
            return "\n\tYou have $ " + money + " in your account";
        } else {
            return "\n\tYou do not have access to this information";
        }
    }
    
    @Override
    public void deposit() {
        if (checker != 0) {
            if (accountNumber() == accNumber) {
                System.out.print("\n\tHow much do you want to deposit: $");
                double amount = input.nextDouble();
                money += amount;
            }//end of inner if statement
            else {
                System.out.println("\nSorry wrong account number");
            }
        }//end of outer if statement
    }//end of method

    @Override
    public void withdrawl() {
        if (checker != 0) {
            if (accountPinNumber() == np.pinNumber1) {
                System.out.print("\n\tHow much do you want to withdrawl: $");
                double amount = input.nextDouble();

                if (amount > money) {
                    System.out.println("\n\tYou do not have enough funds!!");
                }//end of last if statement
                else {
                    money = (money - amount);
                }
            }//end of middle second if statement
            else {
                System.out.println("\nSorry wrong pin number");
            }
        }//end of first if statement
    }//end of method

   //---------------CHECKS the login verification---------------------
    @Override
    public void check() {
        if (userName.equals(np.username[x-1])) {
            if (userPassword.equals(np.password[x-1])) { 
                checker++;
            }//end of inner if statement
            else {
                System.out.println("Sorry incorrect password");
                System.exit(0);
            }
        }//end of outer if statement
        else {
            System.out.println("Sorry username not found");
            System.exit(0);
        }
    }//end of check method

    public static void main(String args[]) {
        bankTransaction user = new bankTransaction(123456789);
        Scanner input1 = new Scanner(System.in);

        System.out.println("\t\t\tWelcome to Bank of Patel");
//-------------------creating a bank account--------------------------
        System.out.println("\nLets start off by creating a account");
        np.makeUserName();
        np.makePassword();
        np.makePinNumber();
        System.out.println("\n Your account number is 123456789");
        user.moneyInput();
//---------------------logining into your bank account------------------------      
        user.accountUser();
        user.accountPassword();
//-----------------------verifies the login information--------------------------        
        user.check();
//------------------------menu list-----------------------------   
        while (choice != 4) {
            menu();
            System.out.println("what can I assist you with?");
            System.out.print("Choice: ");
            choice = input1.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println(user.moneyInAccount());
                    break;
                }
                case 2: {
                    user.deposit();
                    break;
                }
                case 3: {
                    user.withdrawl();
                    break;
                }
                case 4: {
                    System.out.println("\nThank you have a great day!!");
                }
            }//end of switch case statement
        }//end of while loop

    }//end of main
}//end of class
