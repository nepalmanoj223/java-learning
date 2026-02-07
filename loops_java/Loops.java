package loops_java;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        /*
            syntax of loops:

            1 For loops:
            for (initialization; condition; increment.decrement){
              Block of code to execute
            
            }


            2 While loops:
            while (condition){
              Block of code to execute
            
            }
            3 Do While loops:
            do {
              Block of code to execute
            
            }while(condition);
              

        */

//  Wap to print a number till n entered by user using for loop

        Scanner a= new Scanner(System.in);
        System.out.print("Enter the number till whicch you ant to print : ");
        int n= a.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //  Wap to print a number till n entered by user using while loop
        int count=1;
        while (count<=n) {
            System.out.print(count + " ");
            count+=1;
        }
 
                //  Wap to print a number till n entered by user using do while loop
                System.out.println("");
        int b=1;
        do{
            System.out.print(b+" ");
            b+=1;
        }while(b<=n);

    }
}
