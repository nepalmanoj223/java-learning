package Atm;

import java.util.Scanner;

public class Atm {
static Scanner in=new Scanner(System.in);
static int balance=78500;
static int newbalance;


    public static void main(String[] args) {
        System.out.println("Hello Welcome to Manoj Random Atm");
        System.out.println("Please Enter your Credentials to move forward :");
        credentials();
        
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
        else{
            System.out.println("Welcome Mr " + newname + " What would you like to do!");
            menu();
        }
         
       
        }
        
    static void menu(){
        System.out.println("Menu : ");
        System.out.print("Balance Query [1]"); System.out.print(" Withdraw [2]"); System.out.print(" Deposit [3]"); System.out.print(" Password Chnage [4]"); System.out.println(" Mini Statements [5]");
        System.out.println("Enter the code : ");
        int code=in.nextInt();
        switch(code) {
            case 1 :{balance();
            break;}
            case 2 :{Withdraw();
            break;
            }
            case 3 :{Deposit();
            break;}
            case 4:
                {
                    Passchang();
                    break;
                }
            case 5:
                {
                    Mini();
                    break;
                }
            default:{
                System.out.println("Invalid");
                break;
            }
        }

      
    }
    static void balance(){
        System.out.println("Your balance is : " +balance);
    }
    static void Withdraw(){
        System.out.print("Enter your desired amt : ");
        int amt=in.nextInt();
        while (amt>balance) {
            System.out.print("Your amt exceeds balance ! Enter again :");
            amt=in.nextInt();
        }
        if (amt<=balance) {
            System.out.println("Processing ....");
            System.out.println("Wirthdraw complete");
            newbalance=balance-amt;
            System.out.println("Remaining balance is "+newbalance);
            System.out.println("Thanks for choosing us !");
        }
    }
    static void Deposit(){
        System.out.print("Enter your desired amt : ");
        int depo=in.nextInt();
        newbalance=balance+depo;
        System.out.println("Processing ....");
        System.out.println("Deposit complete");
        System.out.println("New balance is "+newbalance);

    }
    static void Passchang(){
        String valid=in.next();
        System.out.print("Do you want to change password! enter yes or no");
        if (valid.equals("yes")) {
            System.out.println("Reach for bank desk or call at toll free no ");
        }
        

    }
    static void Mini(){}




    }

    


