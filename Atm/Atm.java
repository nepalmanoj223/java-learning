package Atm;

import java.util.Scanner;

public class Atm {
static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Manoj Random Atm");
        System.out.println("Please Enter your Credentials to move forward :");
        credentials();
        menu();
    }

    static void credentials(){
        long accountn= 407012346;
        String name= "Manoj";
        String password="Manoj@124";
        System.out.print("Enter your user name : ");
        String newname=in.next();
        int count=3;
        int j=3;
        boolean blocked=false;
       if (!name.equals(newname)) {
            System.out.println( "Your username doesnot match you have three tries only") ;
            for(count=3; count>0; count--){
                newname=in.next();
                if(name.equals(newname)){
                    System.out.println("Welcome "+name);
                    break;
                }
                System.out.println( "Try again!") ;

            }
           if (count == 0) { 
             System.out.println(" Too many attempts account has been blocked");
             blocked = true;
                }   
            if (blocked == true) {
            return;
            }
        }
        else{
             System.out.println("Welcome "+name+ " please enter your password to move forward!");

        }
        System.out.print("Enter your Password : ");
        String newpass=in.next();
        if(!password.equals(newpass)){
            System.out.println( "Your password doesnot match you have three tries only") ;
            for(j=3; j>0; j--){
            System.out.print( "Enter again :- ");
            newpass=in.next();
            if (newpass.equals(password)) {
                System.out.println("Welcome Mr " + newname + " What would you like to do!");
                break;
            }}
            if (j == 0) { 
             System.out.println(" Too many attempts account has been blocked");
             blocked = true;
                }   
            if (blocked == true) {
            return;
            }
            
        }
       
        }
        
    static void menu(){
        System.out.println("Menu : ");
        System.out.print("Balance Query [1]"); System.out.print(" Withdraw [2]"); System.out.print(" Deposit [3]"); System.out.print(" Password Chnage [4]"); System.out.print(" Mini Statements [5]");
    }

    }

    


