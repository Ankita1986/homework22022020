package homework22022020;

import java.util.Scanner;

/*  Java program to calculate the average value of array
        elements*/

public class Example19AverageValueOfArray {
    // Declaration of main method
    public static void main(String[] args) {
        array();
    }


    //Declaration of user define method
    public static void array() {
        // Scanner declaration
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
        /*
          Average value of array elements would be
         total sum of all elements/total number of elements
         */
        int avg = total / a.length;
        System.out.println("The average of Array Element is " + avg);

    }
}






















