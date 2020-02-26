package homework22022020;

import java.util.Scanner;
// Write a program that tells us input value is number or an alphabet or symbol.

public class Example12CharacterCheck {
    // Main Method Declaration
    public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any Input Value");
        char ch = s1.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A Number");
        } else {
            System.out.println(ch + " is a Symbol");
        }


    }


}





