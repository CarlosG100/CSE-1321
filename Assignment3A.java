package Assignment3;
import java.util.Scanner;
public class Assignment3A {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        float xIn, yIn;

        System.out.println("[Cretaceous Park GIS]");
        System.out.println("X Coordinate: ");
        xIn = scan.nextFloat();
        System.out.println("Y Coordinate: ");
        yIn = scan.nextFloat();

        if (xIn < 0 || xIn > 8 || yIn < 0 || yIn > 8){
            System.out.println("WARNING: You have left the boundaries of the park.");
            System.out.println("Please return immediately");
        }
        else if (xIn >=2 && xIn <= 5 && yIn >= 2 && yIn<= 6) {
            System.out.println("You are at the T. Rex Lake");
        }
        else if (xIn >= 0 && xIn <= 2 && yIn >= 0 && yIn <= 8 ) {
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (xIn >= 2 && xIn <= 5 && yIn >= 0 && yIn <= 2 ){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (xIn >= 2 && xIn <= 5 && yIn >= 6 && yIn <= 8){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (xIn >= 5 && xIn <= 6 && yIn >= 2 && yIn <= 5){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (xIn >= 4 && xIn <= 5 && yIn >= 4 && yIn <= 5){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (xIn >=2 && xIn <= 5 && yIn >= 2 && yIn<= 6){
            System.out.println("You are at the T. Rex Lake");
        }
        else if(xIn >= 5 && xIn <= 8 && yIn >= 0 && yIn <= 2){
            System.out.println("You are at the Pterodactyl Aviary");
        }
        else if(xIn >= 6 && xIn <= 8 && yIn >= 2 && yIn <= 4){
            System.out.println("You are at the Visitor's Center");
        }
        else if(xIn >= 5 && xIn <= 8 && yIn >= 5 && yIn <= 8){
            System.out.println("You are at the Deinonychus Pen");
        }




    }
}
