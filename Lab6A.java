
import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int greatestNum = 0, i, num;
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        for (i = 1; i <= 10; i++) {
            System.out.print("Please enter number " + i + ": ");
            num = scan.nextInt();
            if (num > greatestNum) {
                greatestNum = num;
            }
        }
        System.out.println("The largest number was " + greatestNum);
    }
}

