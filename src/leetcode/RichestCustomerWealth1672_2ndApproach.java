package leetcode;

import java.util.Arrays;

public class RichestCustomerWealth1672_2ndApproach {

    public static void main(String[] args) {

        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

        int maximumWealth = maximumWealth(accounts);
        System.out.println(maximumWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int moneyTotal = 0;
            for (int money : account) {
                moneyTotal = moneyTotal + money;
            }
            maxWealth = Math.max(maxWealth, moneyTotal);
        }
        return maxWealth;
    }

}
