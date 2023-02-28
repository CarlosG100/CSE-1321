package testPractice;
import java.util.Scanner;
public class testPractice1B2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String userName;

        System.out.println("What is your name? ");
        userName = scan.nextLine();

        if (userName.equalsIgnoreCase("I'munique") || userName.equalsIgnoreCase("Elizabeth")){
            System.out.println("Why would your parents name you that?");
            }
            else{
                System.out.println("Well, hello!");
            }

        }
    
    }
