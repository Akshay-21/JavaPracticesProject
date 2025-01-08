package leetcode;

public class TwoSum1 {

    public static void main(String[] args) {

        int nums[] = new int[]{11, 2, 15, 7};
        int target = 9;
        int index1 = 0;
        int index2 = 0;
        int aa[] = new int[2];



        for (int i = 1; i<nums.length; i++){

            int first = nums[0];

            System.out.println(first + ", " + nums[i]);

            if(first + nums[i] == target){
                index1 = first;
                index2 = nums[i];
            }
        }

//        System.out.println(index1);
//        System.out.println(index2);

    }
}
