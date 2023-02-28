package Assignment2;

import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters, distanceFromMoon, animalCrackers;

        System.out.println("[Distance Calculator]");
        System.out.println("How many meters?");
        meters = scan.nextDouble();

        distanceFromMoon = meters * 0.0000000026;
        animalCrackers = meters / 0.025;

        System.out.println(meters + " meter(s) is...");
        System.out.println("... " + distanceFromMoon + " distance from the Moon");
        System.out.println("... " + (int) animalCrackers + " Animal Crackers long");
    }
}


