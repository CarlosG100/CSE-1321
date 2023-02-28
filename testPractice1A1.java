package testPractice;
import java.util.Scanner;
public class testPractice1A1{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vel, time, totalDistance;

        System.out.println("What is the velocity of the object in mph? ");
        vel = scan.nextInt();
        System.out.println("How many hours did the object travel? ");
        time = scan.nextInt();

        totalDistance = vel * time;

        System.out.println("Total distance traveled = " + totalDistance + " miles.");


    }
}

