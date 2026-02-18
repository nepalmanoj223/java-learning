package Array;

import java.util.Scanner;

public class Chatgptques {

    public static void main(String[] args) {
        /*
        1. Sum of Array

Write a program that takes an integer array and prints the sum of all elements.

Example:

Input: [something]
Output: sum of that something
        */
       int [] ar={1,2,3,4,5,6,7,8,9};
       int sum=0;
       for(int i=0; i<ar.length; i++){
        sum=sum+ar[i];
       }
       System.out.println(sum);

       nw();
       rev();
       count();
       remove();
       arrsum();
       minmax();
       evenodd();
       search();
    }
    static void nw(){
        /*  
           2. Largest and Smallest Element

Find the largest and smallest number in a given integer array.

Example:

Input: [5, 1, 9, 3]
Output: Largest = 9, Smallest = 1
           */
        int [] in= {9,14,12,15};
        int smallest=in[0];
        int largest=in[0];
        for(int i=0; i<in.length; i++){
            if (smallest>in[i]){
                smallest=in[i];
            }
        }
        System.out.println(smallest);
         for(int i=0; i<in.length; i++){
            if (largest<in[i]){
                largest=in[i];
            }
        }
        System.out.println(largest);

    }
    
    static void rev(){
        /*   3. Reverse an Array

        Print the array in reverse order without using built-in functions like Collections.reverse().

        Example:

        Input: [1, 2, 3, 4]
        Output: [4, 3, 2, 1] */

        int [] arr={1,2,3,4};
        int []next= new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr.length; j++){
                if (j == arr.length - 1 - i) {       
                next[j] = arr[i];
        }

            }
        }
        for (int i=0; i<next.length; i++){
        System.out.print(next[i] +" ");
        }
    }

    static void count(){
        /*   
        
            4. Count Occurrences

            Count how many times a given value appears in the array.

             xample:    

            Input: [1, 2, 2, 3, 2], value = 2
            Output: 3
            */
        int [] a = {1,2,3,4,5,1,3};
        int count=0;
        // value= 2;
        for(int i=0; i<a.length; i++){
            if(a[i]==2){
                count=count+1;
            }
        }
        System.out.println(" The value 2 has occure " +count +" times");
        }

    static void remove(){
        /* 5. Remove Duplicates

        Remove duplicates from a sorted array and print the result.
        Hint: Use a new array or modify in-place.

        Example:

        Input: [1, 2, 2, 3, 3, 3, 4]
        Output: [1, 2, 3, 4] */

        // int[] old={1,2,3,2,4,1,5,7,3,4};
        // int[]  neww = new int[old.length];
        // neww[0]=old[0];
        // for(int i=1; i<old.length; i++){
        //     if(old[i] != neww[i]){
        //         neww[i]=old[i];
        //     }
        // }
        // for(int j=0; j<neww.length; j++){
        // System.out.print(neww[j] + " ");}
    }

    static void arrsum(){
        //Sum of Elements
        // Given an array of integers, find the sum of all elements.

        int [] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }

        System.out.println(sum);
}

static void minmax(){

//     Without using any library functions:

// Find the maximum and minimum element in the array in a single loop.
    int [] a= {1,2,3,4,5,6,19};
    int max=a[0];
    int min=a[0];
    for( int i=0; i<a.length; i++){
        if(max<a[i]){
            max=a[i];
        }
        if(min>a[i]){
            min=a[i];
        }
    }
    System.out.println(max);
    System.out.println(min);

}

    static void evenodd(){
        // Count Even & Odd
        // Count how many even and odd numbers are in an array.
        int coutnevn=0;
        int coutodd=0;
        int arr[]={1,2,3,4,5,6,8,9,69,12,45};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                coutnevn=coutnevn+1;
            }
            else{
                coutodd=coutodd+1;
            }
        }
        System.out.println(coutnevn);
        System.out.println(coutodd);
    }

static void search(){
Scanner in = new Scanner(System.in);
    /*Search an Element
    Check if a given number exists in the array. */
    System.out.print("Enter an item to look for : ");
    int num= in.nextInt();
    int arr[]={1,2,34,6,4,32,13};
    for (int i =0; i<arr.length; i++){
        if(num==arr[i]){
            System.out.println("your element is found in" +i+ " index !");
        }
    }
}

    }
