package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412_2ndApproach {

    public static void main(String[] args) {

        List<String> strings = fizzBuzz(15);
        System.out.println(strings);
    }

    private static List<String> fizzBuzz(int n) {

        List<String> dataList = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String arrayStringValue = "";

            if (i % 3 == 0) {
                arrayStringValue = arrayStringValue + "Fizz";
            }

            if (i % 5 == 0) {
                arrayStringValue = arrayStringValue + "Buzz";
            }

            if (arrayStringValue.isEmpty()) {
                arrayStringValue = arrayStringValue + String.valueOf(i);
            }

            dataList.add(arrayStringValue);
        }
        return dataList;
    }

}
