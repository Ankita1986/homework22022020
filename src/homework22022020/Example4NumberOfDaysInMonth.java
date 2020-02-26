package homework22022020;

public class Example4NumberOfDaysInMonth {
    // Main method declaration
    public static void main(String[] args) {
        isLeapYear(2020); // Static method calling directly for isLeap year
        getDaysInMonth(11, 1);  // Static method calling for getdaysInMonth
    }


    public static void isLeapYear(int year) { // Static method for leap year
        if (year >= 1 && year <= 9999) {  // Condition for valid year
            switch (year % 4) { //then switch operates
                case 0:    // Case for leap year
                    if (year % 100 == 0) {  //Condition for leap year
                        if (year % 400 == 0) {
                            // true leap year statement
                            System.out.println(year + " is a Leap year," + true);
                        } else
                            // false leap year statement
                            System.out.println(year + " is not a Leap year," + false);
                    } else
                        // true statement
                        System.out.println(year + " is a Leap year," + true);
                    break;
                default:
                    // default statement always false
                    System.out.println(year + " is not a Leap year," + false);
                    break;
            }
        } else
            // print statement for invalid year input
            System.out.println(false + "Invalid input");
    }

    // second static method for days of month
    public static void getDaysInMonth(int month, int year) {
        int numDays = 0;
        // valid condition for month and year
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            // Using swith statement
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                case 2:
                    if (((year % 4 == 0) &&
                            // leap year condition
                            !(year % 100 == 0))
                            || (year % 400 == 0))
                        numDays = 29;
                    // days assigned to feb in leap year
                    else
                        numDays = 28;
                    // days for feb on non leap years
                    break;
                default:
                    System.out.println("-1, Invalid request"); // default statement for month
                    break;


            }
        } else System.out.println("-1, Invalid request"); // default for invalid year input
        // print no.of days in month
        System.out.println("Number of days in the month = " + numDays);
    }


}
