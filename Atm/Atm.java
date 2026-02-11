package Atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Hello Welcome to Manoj Random Atm");
        System.out.println("Please Enter your Credentials to move forward :");
        credentials();
    }

    static void credentials(){
        Scanner in= new Scanner(System.in);
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
             System.out.println("Welcome "+name);

        }
        System.out.print("Enter your Password : ");
        String newpass=in.next();
        if(!password.equals(newpass)){
            System.out.println( "Your password doesnot match you have three tries only") ;
            for(j=3; j>0; j--){
            System.out.print( "Enter again");
            newpass=in.next();
            if (newpass.equals(password)) {
                System.out.println("Welcome Mr " +newname + " What would you like to do!");
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
        else{
            System.out.println("Welcome Mr" +newname + "What would you like to do!");
        }
        }

    }
    


