package Wspolbierznosc.Wykonawcy;

import Wspolbierznosc.DefiniowanieZadan.LiftOff;

import java.util.concurrent.*;

/**
 * Created by Marek on 2017-05-06.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
