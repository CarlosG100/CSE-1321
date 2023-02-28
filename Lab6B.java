
import java.util.Scanner;
import java.util.Random;

public class Lab6B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int userInput, systemGuess, systemCount=0;


        do{
            System.out.println("Enter a number between 1 and 1000: ");
            userInput = scan.nextInt();
        } while (userInput < 1 || userInput > 1000);

        do{
            systemGuess = rand.nextInt(1000)+1;
            systemCount++;
            System.out.println("My guess was " + systemGuess);
        }while (systemGuess != userInput);

        System.out.println("I guessed the number was " + userInput + " and it only took me " + systemCount + " guesses.");


    }

}
