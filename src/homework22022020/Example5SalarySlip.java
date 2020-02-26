package homework22022020;

import java.util.Scanner;

public class Example5SalarySlip {
    // Main method declaration
    public static void main(String[] args) {
        Example5SalarySlip obj = new Example5SalarySlip();
        obj.mySalarySlip();
    }
    // Declaration of user define method
        public void mySalarySlip() {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employ ID : ");
            int eId = sc.nextInt();
            System.out.println("Enter Employee Name : ");
            String eName = sc.next();
            System.out.println("Enter Basic Salary : ");
            int basicSalary = sc.nextInt();
            int hra = (basicSalary * 10)/ 100;
            int ta = (basicSalary * 8)/ 100;
            int da = (basicSalary * 9)/ 100;
            int pf = (basicSalary * 20)/ 100;
            double grossSalary = basicSalary+hra+ta+da-pf;

            System.out.println("______________________________________");
            System.out.println("|                   Salary Slip       |");
            System.out.println("|_____________________________________|");
            System.out.println("|Employ ID           : "+eId+"            |");
            System.out.println("|Employ Name         : "+eName+"         |");
            System.out.println("|_____________________________________|");
            System.out.println("|Basic Salary        : "+basicSalary+"         |");
            System.out.println("|HRA 10%             : "+hra+"           |");
            System.out.println("|TA 8%               : "+ta+"             |");
            System.out.println("|DA 9%               : "+da+"           |");
            System.out.println("|PF 20%              : "+pf+"           |");
            System.out.println("|____________________________________  |");
            System.out.println("|Gross Salary        : "+grossSalary+"       |");
            System.out.println("|=====================================|");




















        }












































}
