package demointerface;

public class Test2 implements Demo{
    private int square;
    @Override
    public void write(int val) {
        square = val * val;
    }

    @Override
    public int read() {
        return square;
    }
}
