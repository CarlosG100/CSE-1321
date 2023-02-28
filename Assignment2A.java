package Assignment2;
import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int first, second, sum, difference, product, quotient,userInputMO,sum1, difference1, product1, quotient1;

        System.out.println("Enter first number: ");
        first = scan.nextInt();

        System.out.println("Enter second number: ");
        second = scan.nextInt();

        System.out.println("Enter number for Modulo Operation: ");
        userInputMO = scan.nextInt();

        sum = first + second;
        difference = first - second;
        product = first * second;
        quotient = first / second;
        sum1 = sum % userInputMO;
        difference1 = difference % userInputMO;
        product1 = product % userInputMO;
        quotient1 = quotient % userInputMO;

        System.out.println(first + " + " + second + " = " + sum + ". The remainder if divided by " + userInputMO + " is " + sum1 + ".");

        System.out.println(first + " + " + second + " = " + difference + ". The remainder if divided by " + userInputMO + " is " + difference1 + ".");

        System.out.println(first + " + " + second + " = " + product + ". The remainder if divided by " + userInputMO + " is " + product1 + ".");

        System.out.println(first + " + " + second + " = " + quotient + " (Approximately). The remainder if divided by " + userInputMO + " is " + quotient1 + ".");
    }
}
