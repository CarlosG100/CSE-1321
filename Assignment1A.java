package Assignment1;

import java.util.Scanner;
public class Assignment1A
{
    public static void main(String[] args)
    {
        float red, invertRed;
        float green, invertGreen;
        float blue, invertBlue;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a red value between 0-255: ");
        red = scan.nextInt();

        System.out.print ("Enter a green value between 0-255: ");
        green = scan.nextInt();

        System.out.print ("Enter a blue value between 0-255: ");
        blue = scan.nextInt();

        invertRed = 255 - red;
        invertGreen = 255- green;
        invertBlue = 255-blue;



        System.out.println ("The inverted color of red = " + invertRed);
        System.out.println ("The inverted color of green = " + invertGreen);
        System.out.println ("The inverted color of blue = " + invertBlue);

        float redFloat = invertRed / 255;
        float greenFloat = invertGreen / 255;
        float blueFloat = invertBlue / 255;

        System.out.println ("With floating points, that would be red = " + redFloat);
        System.out.println ("green = " + greenFloat);
        System.out.println ("blue = " + blueFloat);
    }
}
