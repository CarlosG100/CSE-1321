package Assignment3;
import java.util.Scanner;
public class Assignment3B {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int imageWidth, imageHeight, fileSize, BCP, pixels;

        System.out.println("[Image Encoding Checker");
        System.out.println("What is the image width? ");
        imageWidth = scan.nextInt();
        System.out.println("What is the image height? ");
        imageHeight = scan.nextInt();
        System.out.println("What is the file size (in bytes)? ");
        fileSize = scan.nextInt();

        pixels = imageHeight * imageWidth;
        BCP = fileSize / pixels;

        if (imageWidth <= 0 || imageHeight <= 0 || fileSize <= 0){
            System.out.println("The information is invalid - please re-enter it.");
        }

        if(fileSize <= 0) {
            System.out.println("");
        }
        else if(fileSize != pixels * 3 && fileSize != pixels * 6 && fileSize != pixels * 9) {
            System.out.println("The information is invalid - please re-enter it.");
        }


        switch (BCP){
            case 3:
                System.out.println("The RGB image is encoded with 8 bits per channel.");
                break;
            case 6:
                System.out.println("The RGB image is encoded with 16 bits per channel.");
                break;
            case 9:
                System.out.println("The RGB image is encoded with 32 bits per channel.");
                break;
        }
    }
}
