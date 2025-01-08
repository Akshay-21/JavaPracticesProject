package demointerface;

public class Main {

    public static void main(String[] args) {

        Demo obj = new Test1();
        obj.write(1);
        System.out.println(obj.read());

        Demo obj2 = new Test2();
        obj2.write(9);
        System.out.println(obj2.read());


        Demo obj3 = new Demo() {
            @Override
            public void write(int val) {

            }

            @Override
            public int read() {
                return 0;
            }
        };
    }

}
