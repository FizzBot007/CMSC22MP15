import java.util.Scanner;

public class ThreadTest {

    public static void main(String[] args) {
        long start, end, time;
        long start2, end2, time2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Table Size:");
        int x = in.nextInt(); 
        
        start = System.currentTimeMillis();
        Threaded test1 = new Threaded(x);
        test1.print();
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("THREADED: " + time);

        
        
        start2 = System.currentTimeMillis();
        NonThreaded test2 = new NonThreaded(x);
        test2.print();
        end2 = System.currentTimeMillis();
        time2 = end2 - start2;
        System.out.println("NON-THREADED: " + time2);
    }
}