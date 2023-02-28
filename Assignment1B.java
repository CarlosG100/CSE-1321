package Assignment1;
import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1;
        int Num1;
        float Cost1;

        String item2;
        int Num2;
        float Cost2;

        float Total1;
        float Total2;
        float TotalCost;




        System.out.println("What are you buying? ");
        item1 = scan.nextLine();
        System.out.println("How Many? ");
        Num1 = scan.nextInt();
        System.out.println("What do they cost? ");
        Cost1 = scan.nextFloat();

        Total1= Num1 * Cost1;

        scan.nextLine();

        System.out.println("What else are you buying? ");
        item2 = scan.nextLine();
        System.out.println("How Many? ");
        Num2 = scan.nextInt();
        System.out.println("What do they cost? ");
        Cost2 = scan.nextFloat();

        Total2 = Num2 * Cost2;

        TotalCost = Total1 + Total2;

        System.out.println( "Your List: ");
        System.out.println(item1 + " (" + Num1 + ")");
        System.out.println("$" + Cost1 + " (" + "$" + Total1 + " total" + ")");

        System.out.println("     ");

        System.out.println(item2 + " (" + Num2 + ")");
        System.out.println("$" + Cost2 + " (" + "$" + Total2 + " total" + ")");

        System.out.println("     ");

        System.out.println("Total Cost: $" + TotalCost);
    }

}
