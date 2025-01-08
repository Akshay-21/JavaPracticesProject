package leetcode;

import java.util.Arrays;

public class RunningSumOf1DArray2Approach {

    public static void main(String[] args) {

        int nums[] = new int[]{1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println("Array Result:- " + Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums) {

        int array[] = new int[nums.length];

        array[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
                array[i] = array[i-1] + nums[i];
        }
        return array;
    }

}
