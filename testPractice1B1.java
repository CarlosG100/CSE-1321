package testPractice;
import java.util.Scanner;
public class testPractice1B1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float userNum;

        System.out.println("Enter a number between 0-255: ");
         userNum = scan.nextInt();

        userNum = (float) (userNum / 255);

        System.out.printf("Your converted number is %.1f", userNum);
        

    }
}