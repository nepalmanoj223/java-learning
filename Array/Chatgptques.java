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
       rev();

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

}
