import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(multiply(num1,num2));
    }
    static int multiply(int num1, int num2){
        // System.out.println("Enter fist num");
        int mul=num1*num2;
        return mul;   
    }
}


