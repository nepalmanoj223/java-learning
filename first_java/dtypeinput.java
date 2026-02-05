import java.util.Scanner;

public class dtypeinput {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        // System.out.print("Please enter your roll no:");
        // int rollno= a.nextInt();
        // System.out.println("Your roll number is " +rollno);

        //Lets take a string input now:
        //I had to comment out the first integer input part because of the buffer and i will look for the way to fix that
        System.out.print("Name inout please: ");
        String name=a.nextLine();
        System.out.println("Your name is " +name );


    }
}
