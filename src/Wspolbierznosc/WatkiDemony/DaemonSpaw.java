package Wspolbierznosc.WatkiDemony;

/**
 * Created by Marek on 2017-05-07.
 */
public class DaemonSpaw implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
