package Wspolbierznosc.WatkiDemony;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2017-05-07.
 */
public class DaemonFromFactory implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() +" " +this);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwanie sleep()");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 20; i++) {
            exec.execute(new DaemonFromFactory());
            System.out.println("Uruchomiono wszystkie demony");
            TimeUnit.MILLISECONDS.sleep(100);
        }
    }
}
