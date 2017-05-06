package Wspolbierznosc.DefiniowanieZadan.Cwiczenia.Cwiczenie1Str916;

/**
 * Created by Marek on 2017-05-06.
 */
public class Statement implements Runnable {
    public static int count = 1;
    private int id = count++;

    public Statement() {
        System.out.println("Komunikat początkowy");
    }

    @Override
    public void run() {
        System.out.println("Pierwszy komunikat obiektu " +id);
        Thread.yield();
        System.out.println("Drugi komunikat obiektu " +id);
        Thread.yield();
        System.out.println("Trzeci komunikat obiektu " +id);
        Thread.yield();
    }
}
