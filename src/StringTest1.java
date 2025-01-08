public class StringTest1 {
    public static void main(String[] args) {

        boolean b = checkStringObject();
        System.out.println(b);
    }

    private static boolean checkStringObject() {
        String a = new String("Akshay");
        String b = new String("Akshay");

//        System.out.println(a.hashCode());
//        System.out.println();
//        System.out.println(b.hashCode());

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
