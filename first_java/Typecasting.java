import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        

        //narrowing conversion means narrowing a lager datatype into smaller one for type casting

        int num = (int)(65.235f);
        System.out.println(num);

        //automatic type promotions
        int b =257;
        byte c = (byte) (b);//257%256 =1.something just 1 printed
        System.out.println(c);
        //RUles for type promotions

        // all the byte short values are promoted ot int

    }
}
