package loops_java;
//wap to count the occurance of a number in a larger number with several digits

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= in.nextInt();
        System.out.println("Enter the digit to check occurance");
        int chos=in.nextInt();
        int count=0;
        while (num>0) {
            int rem=num%10;
            if(rem==chos){
                count++;
            }
            num=num/10;
        }
        System.out.println("The occurenace of "+chos+" is "+ count);
    }
}
