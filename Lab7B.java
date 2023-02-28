
import java.util.Scanner;
public class Lab7B{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a value for the size: ");
        int size = scan.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");
        for(int i=1;i<=size;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
