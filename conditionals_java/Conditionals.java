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
       Scanner a= new Scanner(System.in);
       System.out.print("Enter your marks");
        float marks=a.nextFloat();

        if (marks>90){
            System.out.println("You did a good job");
        }

        else{
            System.out.println("You need to work more but great work for trying");
        }

    }
}
