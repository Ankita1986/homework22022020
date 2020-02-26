package homework22022020;


import java.util.Scanner;
// This program is to find if an array contains a specific value.

public class Example20SpecificValue {


    // main Method Declaration
    public static void main(String[] args) {
        array();

    }

    //Declaration of user define method
    public static void array() {
        // Declaration of array variables
        int n, x, i;

        // Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of Elements you want in array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the Elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the Elements you want to find : ");
        x = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == x) {



                System.out.println("Elements found at position: " + (i + 1));


            }
        }
    }


}




























