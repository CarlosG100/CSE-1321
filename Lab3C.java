
import java.util.Scanner;

class Lab3C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quartersInput, dimesInput, nickelsInput, penniesInput,
                dollars, cents, quarters, dimes, nickels, pennies, total;

        System.out.print("Enter the number of quarters: ");
        quartersInput = scan.nextInt();

        System.out.print("Enter the number of dimes: ");
        dimesInput = scan.nextInt();

        System.out.print("Enter the number of nickels: ");
        nickelsInput = scan.nextInt();

        System.out.println("Enter the number of pennies: ");
        penniesInput = scan.nextInt();

        System.out.println("You entered " + quartersInput + " quarters.");

        System.out.println("You entered " + dimesInput + " dimes.");

        System.out.println("You entered " + nickelsInput + " nickels.");

        System.out.println("You entered " + penniesInput + " pennies.");

        quarters = quartersInput * 25;
        dimes = dimesInput * 10;
        nickels = nickelsInput * 5;
        pennies = penniesInput * 1;

        total = quarters + dimes + nickels + pennies;
        dollars = total / 100;
        cents = total % 100;

        System.out.println(" ");

        System.out.println("Your total is " + dollars + " dollars and " + cents + " cents" + ".");

    }
}

