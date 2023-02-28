package Assignment4;
import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the square: ");
        int sizeSquare = scan.nextInt();

        while(sizeSquare < 0){
            System.out.println("Invalid input!");
            System.out.println("Enter the size of the square: ");
            sizeSquare = scan.nextInt();
        }


        System.out.println("Enter the size of the border: ");
        int borderSize = scan.nextInt();

        while(borderSize < 0){
            System.out.println("Invalid input!");
            System.out.println("Enter the size of the border: ");
            borderSize = scan.nextInt();
        }


        System.out.println("Enter the color of the square: ");
        int colorSquare = scan.nextInt();

        while(colorSquare != 0 && colorSquare != 1){
            System.out.println("Invalid input!");
            System.out.println("Enter the color of the square: ");
            colorSquare = scan.nextInt();
    }


    System.out.println("Enter the color of the border: ");
    int colorBorder = scan.nextInt();

    while(colorBorder != 0 && colorBorder != 1){
        System.out.println("Invalid input!");
        System.out.println("Enter the color of the border: ");
        colorBorder = scan.nextInt();
        }

        System.out.println("PBM File Contents: ");
        System.out.println("P1");
        
        int width = sizeSquare + borderSize + colorSquare + colorBorder;
        int height = sizeSquare + borderSize + colorSquare + colorBorder;

        System.out.println(width + (" ") + height);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i < borderSize || i >= sizeSquare + borderSize || j < borderSize || j >= sizeSquare + borderSize) {
                    System.out.print(colorBorder + " ");
                } else {
                    System.out.print(colorSquare + " ");
                }
            }
            System.out.println();
        }

        
    }
}