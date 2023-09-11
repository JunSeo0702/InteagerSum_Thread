public class MyThread extends Thread {
    private int [] x;
    private int startIdx;
    private int endIdx;
    private int partialSum;

    public MyThread(int[] x, int startIdx, int endIdx) {
        this.x = x;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
        this.partialSum = 0;
    }
    @Override
    public void run() {
        for(int i=startIdx; i<=endIdx; i++) {
            partialSum += x[i];
        }
    }
    public int getPartialSum() {
        return partialSum;
    }

}



