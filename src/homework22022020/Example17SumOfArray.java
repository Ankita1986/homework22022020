package homework22022020;
// A Java program to sum values of an Array.


import java.util.Scanner;

public class Example17SumOfArray {
    // Declaration of main method
    public static void main(String[] args) {
        array();
    }

    //Declaration of user define method
    public static void array() {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of Elements you want in array");
        int n = sc.nextInt();
        int total = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the  Elements" + " " + (i + 1) + "");
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int value : a) {
            total = total + value;
        }
        System.out.println("The Sum of Array Element is " + total);

    }
}