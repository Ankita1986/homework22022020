package homework22022020;

// Write a java program that tell us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Example1EvenOdd {

    public static void main(String[] args) {


        // Scanner declaration
        Scanner s1 = new Scanner(System.in);
        // Printing statement
        System.out.println("Enter a number");
        // Calling variable through scanner
        int num = s1.nextInt();
        String b = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + b);


    }


}

