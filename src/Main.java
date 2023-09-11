// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] x = new int[100];
        for(int i=0; i<100; i++) {
            x[i] = i;
        }
        MyThread th1 = new MyThread(x,0,49);
        MyThread th2 = new MyThread(x, 50, 99);

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(Exception e) {
            System.out.println(e);
        }
        int totalsum = th1.getPartialSum() + th2.getPartialSum();

        System.out.println(th1.getPartialSum());
        System.out.println(th2.getPartialSum());
        System.out.println(totalsum);

    }
}