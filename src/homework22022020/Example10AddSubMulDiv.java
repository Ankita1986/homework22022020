package homework22022020;
/*  input any two number and ask user to enter their symbol (+, -, /, *) find addition,
        Subtraction, multiplication and division according to their symbol (using if else)*/

import java.util.Scanner;

public class Example10AddSubMulDiv {

    //Declaration of main method
    public static void main(String[] args) {

        addsubmuldiv();
    }

    public static void addsubmuldiv() {

        //Declaration of variables
        double x;
        double y;
        char ch;
        double add;
        double sub;
        double multi;
        double div;

        //Declaration of scanner
        Scanner sc = new Scanner(System.in);
        // Calling input number through scanner
        System.out.println("Please Enter Number1");
        x = sc.nextDouble();
        System.out.println("Please Enter Number2");
        y = sc.nextDouble();
        System.out.println("Please Enter Method you want to use");
        ch = sc.next().charAt(0);
        add = x + y;
        sub = x - y;
        multi = x * y;
        div = x / y;
        if (ch == '+') {
            System.out.println("Addition of Number1 and Number2 : " + add);

        } else if (ch == '-') {
            System.out.println("Subtraction of Number1 and Number2 : " + sub);
        } else if (ch == '*') {
            System.out.println("Multiplication of Number1 and Number2 : " + multi);
        } else if (ch == '/') {
            System.out.println("Division of Number1 and Number2 : " + div);
        }


    }


}
