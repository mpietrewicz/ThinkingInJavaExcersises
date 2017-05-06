package Wspolbierznosc.WatkiDemony;

/**
 * Created by Marek on 2017-05-07.
 */
public class Daemon implements Runnable{
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpaw());
            t[i].start();
            System.out.println("Uruchomiono wątek DaemonSpaw " +i + ". ");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" +i +"].isDaemon() = " +t[i].isDaemon() +". ");
        }
        while (true) {
            Thread.yield();
        }
    }
}
