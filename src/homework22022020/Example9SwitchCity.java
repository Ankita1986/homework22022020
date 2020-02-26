package homework22022020;
/* Input any alphabet from a to f and print their city name accordingly (use switch statement) any other
     Alphabet should be invalid entry*/

import java.util.Scanner;

public class Example9SwitchCity {
    // Main Method Declaration
    public static void main(String[] args) {
        String alphabet;
        // Scanner Declaration
        Scanner s1 = new Scanner(System.in);

        System.out.println("Please Enter any alphabet between a to f ");
        alphabet = s1.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        // Using switch statement
        switch (alphabet) {
            case "a":
                System.out.println("City name is Ahmedabad");
                break;
            case "b":
                System.out.println("City name Baroda");
                break;
            case "c":
                System.out.println("City name is Chandigadh");
                break;
            case "d":
                System.out.println("City name is Delhi");
                break;
            case "e":
                System.out.println("City name is Etava");
                break;
            case "f":
                System.out.println("City name is Faridabad");
                break;
            default:
                System.out.println("Alphabet is not valid");


        }


    }


}
