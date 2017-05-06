package Wspolbierznosc.WatkiDemony;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Marek on 2017-05-06.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
