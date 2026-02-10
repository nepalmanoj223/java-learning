package Switch_Functions;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter grade (A/B/C/D/F): ");
        // char grade = in.next().charAt(0);

        // switch (grade) {
        //     case 'A':
        //         System.out.println("Excellent");
        //         break;
        //     case 'B':
        //         System.out.println("Good");
        //         break;
        //     case 'C':
        //         System.out.println("Average");
        //         break;
        //     case 'D':
        //         System.out.println("Needs Improvement");
        //         break;
        //     case 'F':
        //         System.out.println("Fail");
        //         break;
        //     default:
        //         System.out.println("Invalid grade");
        // }

        //Wap to print days woth respect to their numbers :

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for the respective days in the week : ");
        int day = in.nextInt();
        switch (day) {
           case 1 -> System.out.println("Sunday");
           case 2 -> System.out.println("Monday");
           case 3 -> System.out.println("Tuesday");
           case 4 -> System.out.println("Wednesday");
           case 5 -> System.out.println("Thrusday");
           case 6 -> System.out.println("Friday");
           case 7 -> System.out.println("Saturday");
           default -> System.out.println("INvalid Number for day");

        }
        in.close();
        //so both syntax are corrcect the only diff is that the syntax with break on it is older one this is newer one




    }
}
