package Lab5;
import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput, two, three, five;

        System.out.println("Enter an integer: ");
        userInput = scan.nextInt();

        two = userInput % 2;
        three = userInput % 3;
        five = userInput % 5;

        switch (two) {
            case (0):
                System.out.println("This number is divisible by 2");
                break;
            case 1:
                switch (three) {
                    case (0):
                        System.out.println("This number is divisible by 3");
                        break;
                    case 1:
                        switch (five) {
                            case (0):
                                System.out.println("This number is divisible by 5");
                                break;
                            case 1:
                            default:
                                System.out.println("This number is undetermined");
                        }

                }
        }
    }
}




