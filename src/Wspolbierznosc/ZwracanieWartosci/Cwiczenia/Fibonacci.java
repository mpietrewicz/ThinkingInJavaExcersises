package Wspolbierznosc.ZwracanieWartosci.Cwiczenia;//: generics/Fibonacci.java
// Generate a Fibonacci sequence.

import java.util.concurrent.Callable;

public class Fibonacci implements Callable<Integer>{
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
    public Integer call() throws Exception {
        System.out.println("Wykonywanie fibonacciego dla maxN: " +maxN);
        Integer result = 0;
        for (int i = 0; i < this.maxN; i++) {
            result += this.fib(i);
        }
        return result;
    }
}