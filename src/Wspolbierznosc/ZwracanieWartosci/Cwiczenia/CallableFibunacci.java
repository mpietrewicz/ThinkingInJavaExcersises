package Wspolbierznosc.ZwracanieWartosci.Cwiczenia;

import Wspolbierznosc.ZwracanieWartosci.TaskWithResult;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Marek on 2017-05-06.
 */
public class CallableFibunacci {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();

        for (int i = 0; i < 5; i++) {
            results.add(exec.submit(new Fibonacci(i+15)));
        }


        for (Future<Integer> fs : results) {
            try {
//                System.out.println(fs.isDone());
                System.out.println(fs.get());
//                System.out.println(fs.isDone());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }
            finally {
                exec.shutdown();
            }
        }
    }
}
