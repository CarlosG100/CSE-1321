import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int xVal,yVal;

        System.out.println("Enter x: ");
        xVal = scan.nextInt();
        System.out.println("Enter y: ");
        yVal = scan.nextInt();

        if(xVal == 0 && yVal == 0) {
            System.out.println("This point is the origin.");
        }

            else if(yVal == 0){
                System.out.println("This point is on the x axis.");
            }
            else if (xVal == 0){
                System.out.println("This point is on the y axis.");
        }
            else if(xVal > 0 && yVal > 0){
                System.out.println("This point is in the first quadrant.");
        }
        else if (xVal < 0 && yVal > 0) {
            System.out.println("This point is in the second quadrant.");
        }
             else if (xVal < 0 && yVal < 0) {
            System.out.println("This point is in the third quadrant.");
        }
            else if(xVal > 0 && yVal < 0){
                System.out.println("This point is in the fourth quadrant.");
        }

        }

        }



