package Wspolbierznosc.Usypianie.Cwiczenia;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2017-05-06.
 */
public class RandomlySleepingTask implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        int randomSleep = random.nextInt(10);
        try {
            TimeUnit.MILLISECONDS.sleep(randomSleep*1000);
        } catch (InterruptedException e) {
            System.err.println("Przerwanie!");
        }
        System.out.println(randomSleep);
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new RandomlySleepingTask());
        }
        exec.shutdown();
    }
}
