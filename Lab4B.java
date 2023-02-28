import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day;
        System.out.println("Enter the day: ");
        day = scan.nextLine();

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("I have class today!");
        }
        else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("I should use this time to do my homework.");
        }
        else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("I have class today!");
        }

        else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("I should use this time to do my homework.");
        }

        else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        }
    }

}