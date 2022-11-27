package src.main.java;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(nthTermOfFibonacciSeries(7));
    }

    private static int nthTermOfFibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthTermOfFibonacciSeries(n - 1) + nthTermOfFibonacciSeries(n -2);
    }
}