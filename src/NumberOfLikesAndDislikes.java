import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfLikesAndDislikes {

    public static void main(String[] args) {

        String one = "010101";
        String two = "101101";

//        String one = "0101010010111000110";
//        String two = "1011010010110001001";

        String[] oneArray = one.split("");
        String[] twoArray = two.split("");

        List<String> oneList = Arrays.asList(oneArray);
        List<String> twoList = Arrays.asList(twoArray);

        int count = 0;

        for (int i = 0; i < oneArray.length; i++) {
            if (oneList.get(i).equals(twoList.get(i))) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
