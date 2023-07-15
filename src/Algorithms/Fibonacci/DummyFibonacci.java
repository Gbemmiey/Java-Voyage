package Algorithms.Fibonacci;

import java.util.LinkedList;

public class DummyFibonacci {
    public static long getFib(long n) {
        LinkedList fibValues = new LinkedList();
        if (n < 2) {
            return n;
        } else {
            fibValues.add(0);
            fibValues.add(1);
            long sum = 1;
            long fibno = 1;
            for (int i = 2; i < n; i++) {
                int a = (int) fibValues.get(i - 2);
                int b = (int) fibValues.get(i - 1);
                fibValues.add(a + b);
                fibno = a + b + b;
                sum = sum + fibno;
            }
//            System.out.println(fibValues);
            return fibno;
        }
    }
}
