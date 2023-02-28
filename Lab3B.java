
import java.util.Scanner;

class Lab3B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float C1, G1, C2, G2, C3, G3, C4, G4;
        float totalHours, totalQP;
        float QP1, QP2, QP3, QP4;
        float GPA;

        System.out.print("Course 1 hours: ");
        C1 = scan.nextFloat();

        System.out.print("Grade for course 1: ");
        G1 = scan.nextFloat();

        System.out.print("Course 2 hours: ");
        C2 = scan.nextFloat();

        System.out.print("Grade for course 2: ");
        G2 = scan.nextFloat();

        System.out.print("Course 3 hours: ");
        C3 = scan.nextFloat();

        System.out.print("Grade for course 3: ");
        G3 = scan.nextFloat();

        System.out.print("Course 4 hours: ");
        C4 = scan.nextFloat();

        System.out.print("Grade for course 4: ");
        G4 = scan.nextFloat();

        totalHours = (int)(C1 + C2 + C3 + C4);
        QP1 = C1 * G1;
        QP2 = C2 * G2;
        QP3 = C3 * G3;
        QP4 = C4 * G4;

        totalQP = (int)(QP1 + QP2 + QP3 + QP4);

        GPA = (float)totalQP / totalHours;

        System.out.println("Total hours is: " + totalHours);

        System.out.println("Total quality points is: " + totalQP);

        System.out.println("Your GPA for this semester is " + GPA);
    }
}

