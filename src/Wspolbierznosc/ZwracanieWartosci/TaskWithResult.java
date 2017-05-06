package Wspolbierznosc.ZwracanieWartosci;

import java.util.concurrent.Callable;

/**
 * Created by Marek on 2017-05-06.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() {
        return "Wynik wywołania TaskWithResult " +id;
    }
}
