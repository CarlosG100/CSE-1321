
import java.util.Scanner;
class Lab3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOwed, APR, MPR, MP, aprConvert;

        System.out.print("Amount owed: $");
        amountOwed = scan.nextDouble();

        System.out.print("APR: ");
        APR = scan.nextDouble();

        aprConvert = (APR * 0.01);

        MP = (amountOwed * aprConvert) / 12;

        MPR = (APR / 12);

        System.out.println("Monthly percentage rate: " + Math.round(MPR * 1000.0) / 1000.0);

        System.out.println("Minimum payment: $" + Math.round(MP * 100.0) / 100.0);

    }
}
