package Assignment4;
import java.util.Scanner;
public class Assignment4A{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What loop do you want to use?\n" + "1) A loop that might run zero or more times \n" + "2) A loop that will always run at least once \n" + "3) A loop with a predetermined start and end");
        System.out.print("Your choice: ");
        int userChoice = scan.nextInt();
        
        switch (userChoice){
            case 1:
            System.out.println("What's your start number?");
            int userChoice2 = scan.nextInt();

            System.out.print("Counting: ");

            for(int x = userChoice2; x >= 0 ; x--){
               System.out.print( x + (", "));
        
               }
               break;
               case 2: 
               System.out.println("What's your start number?");
               int userChoice3 = scan.nextInt();

               System.out.print("Counting: ");
               do{
                System.out.print(userChoice3 + (", "));
                userChoice3--;
               }while(userChoice3 >= 0);
               break;
               
               case 3:
               System.out.println("What's your start number? ");
               int userChoice4 = scan.nextInt();
               System.out.println("What's your end number? ");
               int userEnd = scan.nextInt();

               System.out.print("Counting: ");

               while(userChoice4 != userEnd -1){
               System.out.print(userChoice4 + (", "));
               userChoice4--;
               }
               break;
               }
            } 
        
        }

    
