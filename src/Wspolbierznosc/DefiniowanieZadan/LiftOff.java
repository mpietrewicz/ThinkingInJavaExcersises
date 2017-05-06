package Wspolbierznosc.DefiniowanieZadan;

/**
 * Created by Marek on 2017-05-06.
 */
public class LiftOff implements Runnable{
    protected int countDown = 10; // Wartość domyślna
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "# " +id +" \\ " +
                (countDown > 0 ? countDown : "Start!");
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
