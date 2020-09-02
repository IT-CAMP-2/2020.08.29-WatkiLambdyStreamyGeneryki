package pl.camp.it.wielowatkowosc;

public class Main {
    public static void main(String[] args) {
        Watek watek1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);

        watek1.start();
        w2.start();
        w3.start();

        System.out.println("Ostatni linijka maina");
    }
}
