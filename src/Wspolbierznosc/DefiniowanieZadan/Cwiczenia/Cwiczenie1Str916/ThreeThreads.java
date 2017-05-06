package Wspolbierznosc.DefiniowanieZadan.Cwiczenia.Cwiczenie1Str916;

/**
 * Created by Marek on 2017-05-06.
 */
public class ThreeThreads  {
    public static void main(String[] args) {
        for (int i=0; i < 3; i++) {
            new Thread(new Statement()).start();
        }
        System.out.println("Komunikat końcowy");
    }
}
