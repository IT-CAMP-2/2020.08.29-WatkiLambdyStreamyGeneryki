package pl.camp.it.wielowatkowosc.notify;

public class Wysylacz implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Wysylaca cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz wciaz cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz dalej cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysylacz wysyła sygnał !!");
                Main.flag = false;
                Main.lock.notifyAll();
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
