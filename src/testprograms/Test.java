package testprograms;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

//        [10,9,10,23,34,32,24,9,18,10,98,10,4,10,9,10]

        int arr[] = {10,9,10,23,34,32,24,9,18,10,98,10,4,10,9,10};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            int a = arr[i];

            for(int j = 0; j< arr.length; j++){

                if(a == arr[j]){
                    count ++;
                }

            }

//            hashMap.
        }


        System.out.println(count);

    }

}
