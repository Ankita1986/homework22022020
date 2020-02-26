package homework22022020;

import java.util.Scanner;

public class Example7SalesCommission {
    /*WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
    Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
            >= 20,000 10%
            >= 10,000 5%
< 10,000 2%*/
    // main method declaration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sales ID input
        System.out.println("Enter Sales ID :");
        int num = sc.nextInt();
        // Seller name input
        System.out.println("Sellers Name :");
        String name = sc.next();
        // Basic salary input
        System.out.println("Enter the Basic salary");
        int sal = sc.nextInt();
        // Sales amount input
        System.out.println("Enter the sales ammount");
        int a = sc.nextInt();
        // Print Sales ID
        System.out.println("Sales ID : " + num);
        // Print Sellers Name
        System.out.println("Sellers Name :" + name);
        // Print Basic Salary
        System.out.println("Basic Salary : " + sal);
        // Print Sales Ammount
        System.out.println("Sales Ammount : " + a);
        //Using nested if else syntax
        if (a >= 50000) {
            // for sales 50000 or more, commission 35%
            System.out.println("Sales Commission : 35%");
            // Print commission 35%
            System.out.println("Commission Amount :" + (a * 35) / 100);

        } else if (a >= 30000) {
            // for sales 30000 or more, commission 20%
            System.out.println("Sales Commission : 20%");
            // Print commission 20%
            System.out.println("Commission Amount :" + (a * 20) / 100);
        } else if (a >= 20000) {
            // for sales 20000 or more, commission 10%
            System.out.println("Sales Commission : 10%");
            // Print commission 10%
            System.out.println("Commission Amount :" + (a * 10) / 100);
        } else if (a >= 10000) {
            // for sales 10000 or more, commission 5%
            System.out.println("Sales Commission : 5%");
            // Print commission 5%
            System.out.println("Commission Amount :" + (a * 5) / 100);
        } else if (a > 0 && a < 9999) {
            // for sales under 10000, commission 2%
            System.out.println("Sales Commission : 2%");
            // Print commission 2%
            System.out.println("Commission Amount :" + (a * 2) / 100);

        }


    }
}