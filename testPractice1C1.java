package testPractice;
import java.util.Scanner;
public class testPractice1C1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter width: ");
        float userWidth = scan.nextFloat();

        System.out.println("Enter height: ");
        float userHeight = scan.nextFloat();

        float perimeter = (userHeight + userWidth) * 2;

        System.out.println("This is the perimeter " + perimeter);

    }
    
}
