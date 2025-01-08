package leetcode;

public class NumberOfStepsToReduceANumberToZero1342 {

    public static void main(String[] args) {

        int numberOfSteps = numberOfSteps(14);

    }

    public static int numberOfSteps(int num) {

        int stepCount = 0;
        int obtain = 0;


        boolean even = num % 2 == 0;

        while (1 <= num) {
            if (even) {
                obtain = num / 2;
            }

            boolean odd = obtain % 2 == 0;

            if (odd) {

            }

            System.out.println(obtain);
            num--;
        }


        return 0;
    }

}
