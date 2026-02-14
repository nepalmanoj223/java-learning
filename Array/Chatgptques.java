package Array;

public class Chatgptques {
    public static void main(String[] args) {
        /*
        1. Sum of Array

Write a program that takes an integer array and prints the sum of all elements.

Example:

Input: [1, 2, 3, 4]
Output: 10
        */
       int [] ar={1,2,3,4,5,6,7,8,9};
       int sum=0;
       for(int i=0; i<ar.length; i++){
        sum=sum+ar[i];
       }
       System.out.println(sum);


    }
}
