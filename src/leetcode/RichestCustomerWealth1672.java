package leetcode;

import java.util.Arrays;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

        int maximumWealth = maximumWealth(accounts);
        System.out.println(maximumWealth);

        int maxMoney = maxMoneyWealth(accounts);
        System.out.println("maxMoneyValue is:- " + maxMoney);
    }

    public static int maximumWealth(int[][] accounts) {

        int myArr[] = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int i1 = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                i1 = i1 + accounts[i][j];
            }
            myArr[i] = i1;
        }

        System.out.println("New A Arrays Values:- " + Arrays.toString(myArr));

        int maxWealth = myArr[0];

        for (int k = 1; k < myArr.length; k++) {
            if (myArr[k] > maxWealth) {
                maxWealth = myArr[k];
            }

        }
        return maxWealth;
    }

    public static int maxMoneyWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }


    public static void arrayConcept() {

//      2D Array or Multidimensional Array.
        int arr[][] = new int[][]{{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};


        int jaggedArray[][] = new int[][]{{2, 7, 9}, {3, 6, 1}, {7, 4, 2, 5, 23}};
        /* In Jagged Array Row will define but Column will not define by user/or anyone at runtime or at time of creation.
        means column value would not same like other column this could be different.
        if all column value is then that will be 2D array of multidimensional array.*/

        System.out.println(Arrays.toString(arr[0]));

        System.out.println();

        System.out.println("Printing 2D Array Value:- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Printing M value (Row):- " + Arrays.toString(arr[i]));
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Printing MxN value (Row, Column):- " + (arr[i][i]));

        }

        System.out.println();

//        Printing MxN MatrixValue
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Printing MxN Array Values :-" + i);

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("[" + i + "]" + "[" + j + "]" + " : ");
                System.out.println(arr[i][j]);
            }
        }

        System.out.println();

        int[][] b = new int[2][3];
        System.out.println("Arrays B for index 0 :- " + Arrays.toString(b[0]));
        System.out.println("Arrays B for index 1 :- " + Arrays.toString(b[1]));

        System.out.println();

        System.out.println("Arrays B for index 0 length :- " + (b[0].length));
        System.out.println("Arrays B for index 1 length :- " + (b[1].length));

        System.out.println();

        int abc[][] = {{}, {}, {}, {}, {}};
        System.out.println(Arrays.toString(abc));

        System.out.println();

        int xyz[][][] = new int[3][][];
        System.out.println(Arrays.toString(xyz));
    }

    public void waysOfCreatingArrays() {
        String array1[];
        int a[][];

        /*  Init and set the array length   */
        String array[] = new String[2];

        /*  Init an array using Array Literal   */
        String array12[] = new String[]{"Pear", "Apple", "Banana"};
        int[] datas = {12, 48, 91, 17};
        char grade[] = {'A', 'B', 'C', 'D', 'F'};
        float[][] matrixTemp = {{1.0F, 2.0F, 3.0F}, {4.0F, 5.0F, 6.0F}};
        int x = 1, y[] = {1, 2, 3, 4, 5}, k = 3;

        /*  Split array assignment  */
        int[] array23;
        array23 = new int[]{2, 3, 5, 7, 11};


        /*  Init a multidimensional array in a loop.    */
        double[][] temperatures = new double[3][2];

        for (int row = 0; row < temperatures.length; row++)
            for (int col = 0; col < temperatures[row].length; col++)
                temperatures[row][col] = Math.random() * 100;
    }
}
