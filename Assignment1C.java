package Assignment1;
import java.util.Scanner;
public class Assignment1C {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        String MonthString;
        int MonthNum;
        int Day;
        int Year;

        System.out.println("Enter the month (String/ Jan/Feb/ etc..): ");
        MonthString = scan.nextLine();
        System.out.println("Enter the month (number): ");
        MonthNum = scan.nextInt();
        System.out.println("Enter the day (number): ");
        Day = scan.nextInt();
        System.out.println("Enter the year (number): ");
        Year = scan.nextInt();

        System.out.println("     ");

        System.out.println("Here are some ways to represent the date:");
        System.out.print(MonthNum + "/");
        System.out.print(Day + "/");
        System.out.println(Year);
        System.out.println("     ");
        System.out.print(Year + "/");
        System.out.print(Day + "/");
        System.out.println(MonthNum);
        System.out.println("     ");
        System.out.print(Day + "/");
        System.out.print(MonthNum + "/");
        System.out.println(Year);
        System.out.println("     ");
        System.out.print(MonthString + " ");
        System.out.print(Day + ", ");
        System.out.println(Year);
        System.out.println("     ");
        System.out.print(Day + " ");
        System.out.print(MonthString + " ");
        System.out.println(Year);
    }

}
