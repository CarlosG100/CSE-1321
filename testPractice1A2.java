package testPractice;
import java.util.Scanner;

public class testPractice1A2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your GPA? ");
        float userGPA = scan.nextFloat();

        if (userGPA >= 2.0 && userGPA <= 4.0) {
            if (userGPA == 4.0) {
                System.out.println("You're my hero!");
            } else {
                System.out.println("You can graduate.");
            }
        } else {
            System.out.println("Raise your GPA!");
        }
    }
}
 