package Wspolbierznosc.WatkiDemony;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2017-05-07.
 */
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        TimeUnit.SECONDS.sleep(1);
    }
}
