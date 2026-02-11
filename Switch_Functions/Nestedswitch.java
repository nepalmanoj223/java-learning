package Switch_Functions;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        /*Nested Switch (Bank System)

Problem:
Build a mini ATM system:

Main menu:

Check Balance

Withdraw

Deposit

If user selects:

Withdraw → ask amount and process

Deposit → ask amount and process

Use nested switch and conditions.

Bonus: prevent withdrawal if balance is insufficient. */
        Scanner in= new Scanner(System.in);
        System.out.println("Hello customer what do you wanna do :");
        System.out.print("Check balance code 1  ");         System.out.print("Withdraw  code 2 ");        System.out.print("Deposit code 3 ");
        int task=in.nextInt();
        int balance=12234567;
       
        switch (task) {
            case 1:{
                System.out.println("Your balance is : "+ balance);
                break;
            }
             case 2:{
                System.out.print("ENter your desired amt : ");
                int amt= in.nextInt();
                if (amt>balance){
                    System.out.println("Invalid operation high amount");
                    System.out.println("please press 0 to return to same screen");
                    int ret=in.nextInt();
                    if(ret==0){
                        System.out.print("ENter your desired amt : ");
                         amt= in.nextInt();

                         if (amt>balance){
                        System.out.println("Invalid operation high amount");
                        System.out.println("please press 0 to return to same screen");
                         ret=in.nextInt();
                    }
                    
                }}
                else{
                    System.out.println("Withdrawl sucessful");
                    balance=balance-amt;
                    break;
                }
            }
                case 3:{
                    System.out.println("Deposit is not possible through atm in nepal please approach the bank or use mobile banking");
                    break;
                }
                default:{
                 System.out.println("Invalid operation");
        }
                }
                System.out.println("Thanks for chossing my services");
                in.close();
            }
            
        }
    

