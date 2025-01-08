public class TestProgram {

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        new TestProgram().add(3, 2);
    }
    public void add(int a, int b){
        int c = a + b;
        System.out.println("Value of A and B is:- "+c);
    }
}
