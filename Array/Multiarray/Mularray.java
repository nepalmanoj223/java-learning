package Array.Multiarray;

import java.util.Scanner;

public class Mularray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /*   
        
        123
        456
        789
        */

        /*  int[][]={
        {},
        {},
        {}
    }
        or 
        int[][] something= new int [2][];
        */

        //iput in 2D arrays

        int [] [] arr= new int[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                arr[row][col]=in.nextInt();
            }
        }

        //output in 2D array

        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(arr[row][col]+ " ");
            }
        System.out.println(" ");
        }

    }
}
