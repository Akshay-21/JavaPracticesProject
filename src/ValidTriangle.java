public class ValidTriangle {

    private int a;
    private int b;
    private int c;

    private ValidTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        ValidTriangle validTriangle = new ValidTriangle(10, 10, 8);
        validTriangle.isTriangleValid(validTriangle.a, validTriangle.b, validTriangle.c);
    }

    private void isTriangleValid(int a, int b, int c) {
        if ((a + b >= c) && (b + c >= a) && (c + a >= b)) {
            System.out.println("Triable is Valid");
        } else {
            System.out.println("Triable is Not Valid");
        }
    }
}
