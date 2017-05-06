package Wspolbierznosc.WatkiDemony;

import java.util.concurrent.*;

/**
 * Created by Marek on 2017-05-07.
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor{
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
