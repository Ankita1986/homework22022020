package homework22022020;

import java.util.Scanner;

public class Example3GradeOfStudent {
    /* Write a java program to input student Name, roll No, and three subjects Math, Science and English
     marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks
             should between 0 to 100”) and find out total, percentage and result.
     If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 >= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in following format*/
    //Main method declaration
    public static void main(String[] args) {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Student Name:");
        String name = sc.nextLine();
        System.out.println("Please Enter Student Roll No:");
        int roll_no = sc.nextInt();
        String[] sub = {"Maths", "Science", "English"};

        int marks [] = new int[3];
        float total = 0;
        double percent = 0;
        String grade = " ",
                result = " ";
        System.out.println("Enter Marks Of All Subject Between 0 to 100");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter The Marks For " + sub[i] + " :");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percent = (total / 300) * 100;
        System.out.println("Dear " + name + " Your Percentage is : " + percent);
        if (percent >= 80) {
            grade = "A+";
        } else if (percent >= 60 && percent < 80) {
            grade = "A";
        } else if (percent >= 50 && percent < 60) {
            grade = "B";
        } else if (percent >= 35 && percent < 50) {
            grade = "C";
        }
        if (percent >= 35) {
            result = "Pass";
            System.out.println("Your Grade is: " + grade);
            System.out.println("You are " + result);
        } else {
            result = "Fail";
            System.out.println("You are" + result);
        }
        System.out.println("__________________________________________________");
        System.out.println("|                                                  |");
        System.out.println("|               Mark Sheet                           |");
        System.out.println("|__________________________________________________|");
        System.out.println("|    Name                    : "+name+"             |");
        System.out.println("|   Roll No                                         |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Subjects                          Marks             |");
        System.out.println("|____________________________________________________|");
        System.out.println("| Maths                      :        98            |");
        System.out.println("| Science                    :        90             |");
        System.out.println("| English                    :        85             |");
        System.out.println("|___________________________________________________|");
        System.out.println("| Total                      :     "+total+"           |");
        System.out.println("|___________________________________________________|");
        System.out.println("| Percentage                 :    "+percent+"              |");
        System.out.println("| Result                     :    "+result+"                 |");
        System.out.println("| Grade                      :    "+grade+"               |");



        System.out.println("|___________________________________________________|");








    }


}
