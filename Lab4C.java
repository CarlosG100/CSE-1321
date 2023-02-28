import java.util.Scanner;

public class Lab4C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userChoice;
        double userNumber, answer;

        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        userNumber = scan.nextInt();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program");

        userChoice = scan.nextInt();
        switch (userChoice){
            case 0:
                answer = -userNumber;
                System.out.println("The additive inverse of " + userNumber + " is " + answer);
                break;

            case 1:
                answer = 1/userNumber;
                System.out.println("The reciprocal of " + userNumber + " is " + answer);
                break;

            case 2:
                answer = userNumber * userNumber;
                System.out.println("The square of " + userNumber + " is " + answer);
                break;

            case 3:
                answer = userNumber * userNumber * userNumber;
                System.out.println(" The cube of " + userNumber + " is " + answer);
                break;

            case 4:
                System.out.println("Thank you, goodbye!");
                break;

            default:
            System.out.println("Invalid input, please try again!");
            }
        }

    }