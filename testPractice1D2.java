package testPractice;
import java.util.Scanner;
public class testPractice1D2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = scan.nextLine();
        System.out.println("Enter password: ");
        String userPass = scan.nextLine();
        
        if (userName.equals("Reaper") && userPass.equals("cowbell")){
            System.out.println("We need more cowbell, baby!");
        }
        else{
            System.out.println("I don't know you. Try again later.");
        }

    }
    
}
