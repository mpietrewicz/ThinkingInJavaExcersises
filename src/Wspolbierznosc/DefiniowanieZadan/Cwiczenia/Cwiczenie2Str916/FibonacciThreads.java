package Wspolbierznosc.DefiniowanieZadan.Cwiczenia.Cwiczenie2Str916;

/**
 * Created by Marek on 2017-05-06.
 */
public class FibonacciThreads {
    public static void main(String[] args) {
        for (int i=0; i < 5; i++) {
            new Thread(new Fibonacci(i+12)).start();
        }
    }
}
