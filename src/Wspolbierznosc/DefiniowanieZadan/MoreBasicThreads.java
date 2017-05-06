package Wspolbierznosc.DefiniowanieZadan;

/**
 * Created by Marek on 2017-05-06.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i=0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Oczekiwanie na start!");
    }
}
