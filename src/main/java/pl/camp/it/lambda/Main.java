package pl.camp.it.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A3", 140000));
        cars.add(new Car("BMW", "3", 150000));
        cars.add(new Car("Ford", "Mustang", 200000));
        cars.add(new Car("Toyota", "Yaris", 80000));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car, Car t1) {
                return car.getPrice() - t1.getPrice();
            }
        });


        System.out.println(cars);

        Function<String, Car> funkcja =
                x -> new Car(x, x + "Model", 100000);

        Car c = funkcja.apply("TeslA");

        System.out.println(c);

        BiFunction<String, String, Car> biFunkcja =
                (x, y) -> new Car(x, y, 200000);

        Car c2 = biFunkcja.apply("Opel", "Omega");
        System.out.println(c2);

        UnaryOperator<Integer> unary = x -> x*4;

        System.out.println(unary.apply(5));

        Predicate<String> predykat = x -> x.equals("predykat");

        System.out.println(predykat.test("predykat"));

        Supplier<Car> supplier =
                () -> new Car("Fiat", "Punto", 60000);

        Car c3 = supplier.get();

        System.out.println(c3);

        Consumer<Car> consumer = x -> System.out.println(x);

        consumer.accept(c);

        /*Comparator<Car> komparatorSamochodow =
                (x,y) -> y.getPrice() - x.getPrice();*/

        Collections.sort(cars, (x,y)->y.getPrice()-x.getPrice());

        System.out.println(cars);

    }

    public Car function(String x) {
        return new Car(x, x+"Model", 100000);
    }
}
