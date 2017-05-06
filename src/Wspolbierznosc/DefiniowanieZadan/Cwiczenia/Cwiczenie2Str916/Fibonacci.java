package Wspolbierznosc.DefiniowanieZadan.Cwiczenia.Cwiczenie2Str916;//: generics/Fibonacci.java
// Generate a Fibonacci sequence.

public class Fibonacci implements Runnable{
    private int count = 0;
    private int maxN;

    public Fibonacci(int maxN) {
        this.maxN = maxN;
    }

    public int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public void run() {
        System.out.println("Wykonywanie fibonacciego dla maxN: " +maxN);
        for (int i = 0; i < this.maxN; i++) {
            System.out.print(this.fib(i) + " ");
        }
        System.out.println("");
        Thread.yield();
    }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
