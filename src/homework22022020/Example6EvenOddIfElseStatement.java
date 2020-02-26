package homework22022020;
// This programme is to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Example6EvenOddIfElseStatement {
    // main method declaration
    public static void main(String[] args) {
        // declaration of variable
        int a;
        // scanner declaration
        Scanner s1 = new Scanner(System.in);
        //calling variable through a scanner
        System.out.println("Enter an Integer number");
        a = s1.nextInt();

        /*if number is divisible by 2 then it is an even number
         * else odd number
         */
        if (a % 2 == 0) {
            System.out.println("Entered number is even");

        } else {
            System.out.println("Entered number is odd");
        }

    }
}