package pl.camp.it.wielowatkowosc.synch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int a = 0;
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Watek w1 = new Watek();
        Watek w2 = new Watek();

        w1.start();
        w2.start();

        w1.join();
        w2.join();

        System.out.println(Main.a);


        LepszyWatek lepszyWatek = new LepszyWatek();
        new Thread(lepszyWatek).start();

        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());
        singleExecutor.submit(new LepszyWatek());


        ExecutorService multiExecutor = Executors.newFixedThreadPool(3);
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());
        multiExecutor.submit(new LepszyWatek());

        ScheduledExecutorService sheduledExecutor =
                Executors.newScheduledThreadPool(3);
        sheduledExecutor.schedule(new LepszyWatek(), 1, TimeUnit.SECONDS);
        sheduledExecutor.schedule(new LepszyWatek(), 5, TimeUnit.SECONDS);
        sheduledExecutor.schedule(new LepszyWatek(), 1, TimeUnit.MINUTES);
    }
}
