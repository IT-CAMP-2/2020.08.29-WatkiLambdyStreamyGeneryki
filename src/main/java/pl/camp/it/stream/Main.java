package pl.camp.it.stream;

import pl.camp.it.lambda.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int a = 5;
        int b = a+8;
        Car c = new Car();

        List<String> filteredList = list.stream()
                .filter(x -> !(x%2==0))
                .filter(x -> !(x%3==0))
                .map(x -> String.valueOf(x*2))
                .sorted(String::compareTo)
                .peek(Main::saveToDataBase)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(filteredList);
    }

    private static void saveToDataBase(String string) {
        System.out.println("Elemnt: " + string + " saved to database !!");
    }
}
