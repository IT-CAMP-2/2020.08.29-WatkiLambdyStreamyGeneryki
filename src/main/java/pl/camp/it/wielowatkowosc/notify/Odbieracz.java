package pl.camp.it.wielowatkowosc.notify;

public class Odbieracz implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Odbieracz czeka !!!!");
                while(Main.flag) {
                    Main.lock.wait();
                }
                System.out.println("Odebrałem wiadomość !!");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
