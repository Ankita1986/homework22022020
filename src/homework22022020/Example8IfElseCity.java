package homework22022020;

import java.util.Scanner;

public class Example8IfElseCity {
    /* Input any alphabet from a to f and print their city name accordingly (use if else) any other
    Alphabet should be invalid entry*/
// Main Method Declaration
    public static void main(String[] args) {
        String alphabet;
        // Declaration of scanner
        Scanner s1 = new Scanner(System.in);

        System.out.println("Please Enter any alphabet between a to f ");
        alphabet = s1.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        // Using if else statement
        if (alphabet.equals("a")){
            System.out.println("City name is Ahmedabad");

        }else if (alphabet.equals("b")) {
            System.out.println("City name is Baroda");

        }else if   (alphabet.equals("c")){
                System.out.println("City name is Chandigadh");

            }else if (alphabet.equals("d")){
                System.out.println("City name is Delhi");

        }else if   (alphabet.equals("e")){
            System.out.println("City name is Etava");

        }else if (alphabet.equals("f")) {
            System.out.println("City name is Faridabad");
        }else
            System.out.println("Alphabet is not valid");




        }






    }

















