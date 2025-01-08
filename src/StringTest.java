public class StringTest {

    public static void main(String[] args) {

        String a = "Elephant";
        String b = "applea";

        char[] c = b.toCharArray();

        char temp;
        char myValue = 0;
        int value = 0;

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            temp = c[i];
            for(int j=1; j<c.length; j++){
                if(temp == c[j]){
                    myValue = c[i];
                }
            }
        }
        System.out.println(myValue);
    }
}
