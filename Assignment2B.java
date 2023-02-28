package Assignment2;

import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float originalVideolength, videoPlayback;
        int newVideolengthseconds, timeSaved;

        System.out.println("What is the original video time? ");
        originalVideolength = scan.nextFloat();

        int min = (int) originalVideolength;
        float secs = ((originalVideolength - min) * 100);
        float originalVideolengthseconds = (min * 60) + secs;

        System.out.println("What is the playback speed factor?");
        videoPlayback = scan.nextFloat();

        newVideolengthseconds = (int)(originalVideolengthseconds / videoPlayback);
        timeSaved = (int) (originalVideolengthseconds - newVideolengthseconds);

        System.out.println("The new video time would be " + newVideolengthseconds + " second(s).");
        System.out.println("That saves you " + timeSaved + " second(s) from the original video speed.");
    }
}

