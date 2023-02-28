
import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000, userSelection, deposit, withdrawal;
        String userChoice;
        
        System.out.println("Welcome!");
        System.out.println("You have $" + balance + " in your account." );
        
        do {
            System.out.println("Menu");
            System.out.println("0 - Make a deposit");
            System.out.println("1 - Make a withdrawal");
            System.out.println("2 - Display account value");
            
            
            do {
                System.out.print("Please make a selection: ");
                userSelection = scan.nextInt();
                if (userSelection < 0 || userSelection > 2) {
                    System.out.println("Invalid entry, please try again.");
                }
            } while (userSelection < 0 || userSelection > 2);
            
            switch (userSelection) {
                case 0: // deposit
                    System.out.print("How much would you like to deposit? : ");
                     deposit = scan.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 1: // withdrawal
                    System.out.print("How much would you like to withdraw? : ");
                    withdrawal = scan.nextInt();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance = balance - withdrawal;
                        System.out.println("Your current balance is $" + balance);
                    }
                    break;
                case 2: // display balance
                    System.out.println("Your current balance is $" + balance);
                    break;
            }
            scan.nextLine();
            do {
                System.out.println("Would you like to return to the main menu (Y/N)? : ");
                userChoice = scan.nextLine();
            } while (!userChoice.equalsIgnoreCase("Y") && !userChoice.equalsIgnoreCase("N"));
            
        } while (userChoice.equalsIgnoreCase("Y") );
        
        System.out.println("Thank you for banking with us!");
    }
}
