package Wspolbierznosc.DefiniowanieZadan;

/**
 * Created by Marek on 2017-05-06.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Oczekiwanie na start");
    }
}
