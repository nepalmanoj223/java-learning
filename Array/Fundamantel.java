package Array;

import java.util.Scanner;
public class Fundamantel 
{
    Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        //store 5 roll np
        Scanner in= new Scanner(System.in);

        int [] rollno =new int[5];
        rollno[0]=172;
        rollno[1]=124;
        rollno[2]=123;
        rollno[3]=122;
        rollno[4]=12;
        System.out.println(rollno[4]);

        int[]bewa = new int[10];
            //    Input using loop
            for(int i=0; i<bewa.length; i++){
                bewa[i]=in.nextInt();
                // System.out.print(bewa[i]);

            }
            for(int i=0; i<bewa.length; i++){
                System.out.print(bewa[i]+ " ");
            }
    }
}
