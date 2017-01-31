public class MyTimer {
    private final long start;

    public MyTimer() {
        start = System.currentTimeMillis();
    }

    public long getElapsed() {
        return System.currentTimeMillis() - start;
    }
}