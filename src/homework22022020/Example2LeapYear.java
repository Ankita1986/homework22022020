package homework22022020;
// This programme is to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Example2LeapYear {
    //Main method declaration
    public static void main(String[] args) {
        // declaration of variable
        int year, remender;
        // Scanner declaration
        Scanner sc = new Scanner(System.in);
        // Calling variable through scanner
        System.out.println("Enter any year");
        year = sc.nextInt();
        // Using conditional statement
        remender = year % 4;
        if (remender == 0) {
            // printing statement
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }


    }


}
