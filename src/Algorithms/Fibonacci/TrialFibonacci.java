package Algorithms.Fibonacci;

public class TrialFibonacci {
    public static long getFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return (getFibonacci(n - 2) + getFibonacci(n - 1));
        }
    }
}
