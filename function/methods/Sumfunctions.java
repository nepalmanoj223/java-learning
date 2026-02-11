package function.methods;

import java.util.Scanner;

public class Sumfunctions {
    public static void main(String[] args) {
        sum();
    }

static void sum(){
    Scanner in= new Scanner(System.in);
    System.out.print("ENTER NUMBER 1: ");
    int number1= in.nextInt();
    System.out.print("ENTER NUMBER 1: ");
    int number2= in.nextInt();
    int sum= number1+number2;
    System.out.println("The sum is "+sum);


}}



/*
    syntax for functions:

    acess modifier return type name (){
        //boc(Block of code)
    }
*/
