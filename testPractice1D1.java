package testPractice;
import java.util.Scanner;
public class testPractice1D1{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int userB,userH;

	System.out.println("Triangle Area");
	System.out.println("Enter Base: ");
	userB = scan.nextInt();

	System.out.println("Enter Height: ");
	userH = scan.nextInt();

	float A = (float)0.5 * (userB * userH);
	System.out.println("Area = " + A );
	}
}
