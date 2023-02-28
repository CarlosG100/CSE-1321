package Lab5;
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        String state1, state2;

        System.out.println("Do you have a driving permit (Y/N)?");
        state1 = scan.nextLine();

        if (state1.equalsIgnoreCase("Y")){
            System.out.println("Do you have a commercial driving license (Y/N)?");
            state2 = scan.nextLine();

            state2 = (state2.equalsIgnoreCase("Y")?"Congratulations! You can purchase a vehicle, let's start talking options!":"Commercial driving license is a prerequisite to purchase a vehicle!");
            System.out.println(state2);

            }
        else if(state1.equalsIgnoreCase("N")){
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");

        }

    }
}


