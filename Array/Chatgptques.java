package Array;

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
        int largest=in[1];
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
}
