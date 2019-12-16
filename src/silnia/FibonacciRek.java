package silnia;

public class FibonacciRek {
    public static void main(String[] args) {
        int n=9;
        System.out.println("Wartosc ciagu Fibonacciego dla n = "+n+" wynosi: "+fib(n));
    }

    public static int fib(int x){
        if (x == 0) return 0;
        if (x == 1) return 1;

        return fib(x-1) + fib(x-2);
    }
}
