package loops_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the nth term :");
        int n=in.nextInt();
         System.out.println(a);
         System.out.println(b);
        for(int i=2;i<=n; i++){
            int fib=a+b;
            a=b;
            b=fib;
            System.out.println(fib);
        }
    }
}
