import javax.swing.*;

public class PrintEvenNumber {


    public static void main(String[] args) {

        int n = 15;

        int i = 1;

/*        while (i<=n){
            i = +2;
            if(i%2==0){
                System.out.println("even number- "+i);
                i++;
            }
        }*/

        for(i=1; i<n; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


//        while (i <= n) {
//
//
//
//            System.out.println("Hello World!");
//            System.out.println();
//
//            if (n == 1) {
//                System.out.println(n);
//            }
//        }
    }
}
