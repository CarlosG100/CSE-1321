package Assignment3;
import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       String state1,state2;

        System.out.println("[Cretaceous Park Dialog]");
        System.out.println("Oh no, the power has gone out at Cretaceous Park!");
        System.out.println("1) What does that mean?");
        System.out.println("2)No, I just turned the light off.");
        state1 = scan.nextLine();

        if(state1.equals("No, I just turned the light off")){
            System.out.println("Oh thank goodness!");
        }
        else if(state1.equals("What does that mean?")) {
            System.out.println("The dinosaurs will get loose... again...");
            System.out.println("1) Life finds a way...");
            System.out.println("2) What do we do?");
            state2 = scan.nextLine();

            if (state2.equals("Life finds a way...")){
                System.out.println("That's not helpful right now!");
                System.out.println("We have to evacuate the park!");
            }
            else if(state2.equals("What do we do?")){
                System.out.println("We have to evacuate the park!");
            }

        }

    }
}
