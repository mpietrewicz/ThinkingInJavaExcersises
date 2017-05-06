package Wspolbierznosc.WatkiDemony;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2017-05-06.
 */
public class SimpleDaemons implements Runnable{
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
        for (int i = 0; i < 20; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("Uruchomiono wszystkie demony");
        TimeUnit.MILLISECONDS.sleep(2000);
    }
}
