
import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {

        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter Your Number:-");
//        double n = scn.nextInt();

        double n = 1484.0;
        double f = 1.0;
        double i = 1.0;

        while (i <=n) {

            if(n>1){
                System.out.print(n + "x");
            }else {
                System.out.print(n);
            }
                f = f * n;
                n = n - 1;
        }
        System.out.print(" = ");
        System.out.println(f);

        System.out.println("Factorial:- "+f);
    }
}
