public class TestProgram1 {

    public static void main(String[] args) {
//                          0  1 2
        int[] a = new int[]{6, 2, 5};  // [10, 30, 12]    6
//        int[] a = new int[]{6, 2, 5, 4, 3};

        int[] b = new int[a.length];

        int count = 0;  // 0, 1, 2
        int multiply = 0;
        int size = a.length;

        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                b[i] = a[i + 1] * a[i + 2];
            } else if (i == 1) {
                b[i] = a[i - 1] * a[i + 1];
            } else {
                b[i] = a[i - 2] * a[i - 1];
            }
        }

        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }

//             x = 1
//        {6, 2, 5};
        for (int x = 0; x <= a.length; x++) {
            int temp = x;  // 0 1
            for (int y = 0; y < a.length; y++) {
                if (y != temp) {
                    b[x] = a[x] * a[x + 1];
                }
            }
        }



        int temp = 0;
        for(int k = 0; k< a.length; k++){

        }

//        Input integer array: [6,2,5]
//        Output integer array same size

//        10
//        30
//        12
    }
}
