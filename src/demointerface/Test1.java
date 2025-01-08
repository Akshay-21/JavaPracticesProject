package demointerface;

public class Test1 implements Demo, Demo2 {
    private int a;
    @Override
    public void write(int val) {
        a = val;
    }

    @Override
    public int read() {
        return a;
    }

    @Override
    public void add(int add) {

    }

    @Override
    public void addRead() {

    }
}
