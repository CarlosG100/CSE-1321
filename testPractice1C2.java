package testPractice;
import java.util.Scanner;
public class testPractice1C2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value between 1-10: ");
        int userInput = scan.nextInt();

        if(userInput<1){
            System.out.println("Too low!");
        }
            else if(userInput>10){
                System.out.println("Too high!");
            }
                else if (userInput >= 2 && userInput <= 8 ){
                    System.out.println("I like this number");
                }
                else {
                    System.out.println("Rock on, my friend - Rock on...");
                }
            }
        }
    
