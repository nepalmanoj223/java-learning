package conditionals_java;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
            syntax of if statements:
            if(something happes ){
              execute the block
            }

            else{
                    do this block
                }
        */
    //    Scanner a= new Scanner(System.in);
    //    System.out.print("Enter your marks");
    //     float marks=a.nextFloat();

    //     if (marks>90){
    //         System.out.println("You did a good job");
    //     }

    //     else{
    //         System.out.println("You need to work more but great work for trying");
    //     }

   // Chatgpt question: Calculator Input: two numbers and an operator (+ - * /) very  basic will make a separate complex one in calculator repo soon !


     Scanner a = new Scanner(System.in);
     System.out.print("Enter the two numbers to perform operations ");
     int num1 = a.nextInt();
     int num2 = a.nextInt();

    System.out.println("Enter the operator to use");
    String op = a.next();


    if(op.equals("+")){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    else if(op.equals("-")){
        int sub = num1 - num2;
        System.out.println(sub);
    }
    else if(op.equals("*")){
        int mul = num1 * num2;
        System.out.println(mul);
    }
    else if(op.equals("/")){
        int div = num1 / num2;
        System.out.println(div);
    }

     else if(op.equals("%")){
         int div = num1 % num2;
         System.out.println(div);
    }

    //Largest numbers

    
    // System.out.print("Enter the numbers to find the largest");
    // int b= a.nextInt();
    // int c= a.nextInt();
    // int d= a.nextInt();
    // if(b>c && b>d){
    //     System.out.println("The largest number is  " +b);
    // }
    // else if(c>b && c>d){
    //     System.out.println("The largest number is  " +c);
    // }
    // else{
    //     System.out.println("The largest number is "+d);
    // }

a.close();

}

}