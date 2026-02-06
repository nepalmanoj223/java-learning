package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.print("Enter how many numbers to perform the desired calulations");
        Scanner a = new Scanner(System.in);
        int numb= a.nextInt();
        int[] number = new int[numb];
        for (int i=0; numb>i; i++){
            System.out.print("Enter your number");
            number[i]= a.nextInt();
        }
        System.out.println(number);
    }
    
}
