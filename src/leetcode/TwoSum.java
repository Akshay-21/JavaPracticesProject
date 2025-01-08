package leetcode;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = new int[]{3,2,4};
        int target = 6;

//        [1, 2]

        int[] ints = twoSum(nums, target);

        for (int a  = 0; a<ints.length; a++){
            System.out.println(ints[a]);
        }

    }

        public static int[] twoSum(int[] nums, int target) {

            int []aa = new int[2];

            for(int i = 0; i<nums.length; i++){

                for(int j = i+1; j<nums.length; j++){

                    if(nums[i] + nums[j] == target)
                        aa[0] = i;
                        aa[1] = j;
                        break;
                }
            }
            return aa;
        }
}
