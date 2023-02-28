package Lab7;
import java.util.Scanner;
public class Lab7A{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
        int size = scan.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " box:");
        for(int i=0; i < size; i++){
            for (int j=0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
