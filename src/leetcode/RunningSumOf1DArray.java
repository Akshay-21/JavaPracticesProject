package leetcode;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
//        int[] nums = new int[]{1,1,1,1,1};
//        int[] nums = new int[]{3,1,2,10,1};

        int[] result = runningSum(nums);

        System.out.println("Arrays Ways:- " + Arrays.toString(result));

        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + ", ");
        }
    }


    public static int[] runningSum(int[] nums) {

        int i = 1;
        int a = 1;
        int size = nums.length;

        int[] array = new int[nums.length];

        while (a <= size) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                temp = temp + nums[j];
            }
            array[i - 1] = temp;
            i = i + 1;
            size = size - 1;
        }
        return array;
    }
}

/*
*   Time Complexity of This code is O(n^2)
*
*   Space complexity of this code is O(n)
*
* */
