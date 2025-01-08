package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz412 {

    public static void main(String[] args) {

        List<String> stringsValues = fizzBuzz(5);

        System.out.println(stringsValues);
    }

    public static List<String> fizzBuzz(int n) {

        List<String> valueArrayList = new ArrayList<>();

        for (int i = 1; i <=n; i++) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if(divisibleBy3 && divisibleBy5){
                valueArrayList.add("FizzBuzz");
            }else if(divisibleBy3){
                valueArrayList.add("Fizz");
            }else if (divisibleBy5){
                valueArrayList.add("Buzz");
            }else {
                valueArrayList.add(String.valueOf(i));
            }

        }
//        return new ArrayList<>(Arrays.asList("A", "B"));
        return valueArrayList;
    }




    /*  Initialization of ArrayList and Types of initialization of Array list */
    //  https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
}
