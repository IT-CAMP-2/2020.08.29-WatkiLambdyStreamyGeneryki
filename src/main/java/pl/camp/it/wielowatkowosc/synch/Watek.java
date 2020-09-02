package pl.camp.it.wielowatkowosc.synch;

public class Watek extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            synchronized (Main.lock) {
                Main.a = Main.a + 1;
                metod();
            }

        }
    }

    private synchronized void metod() {
        synchronized (Main.lock) {
            System.out.println();
        }
    }
}
