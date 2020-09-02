package pl.camp.it.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.push("ABC");
        String elementFromQueue = queue.pop();

        Response<Integer> response1 = new Response<>();
        Response<String> response2 = new Response<>();

        Integer integer = response1.getObject();
        String string = response2.getObject();

        Pair<String, Integer> para = new Pair<>();
        String element1 = para.getElement1();
        Integer element2 = para.getElement2();

        Figure f = new Circle();
        //FigureBox<Figure> fb = new FigureBox<Circle>();
        //ArrayList<Number> list = new ArrayList<Integer>();

        Pair<String, Figure> p2 = wrapToPair("abc", f);

        metoda(new Circle());
        metoda(new Figure());

        //metoda("SFGSDF");
        //metoda(2534);
        //metoda(new FigureBox<Circle>());

        WildcardGenericClass<Figure, Number> wgc1 =
                new WildcardGenericClass<>(new Figure(), new Long(234));
        System.out.println(wgc1.figure);
        System.out.println(wgc1.number);

        WildcardGenericClass<Circle, Integer> wgc2 =
                new WildcardGenericClass<>(new Circle(), new Integer(435));
        System.out.println(wgc2.figure);
        System.out.println(wgc2.number);

        //WildcardGenericClass<String, Object> sadf;

        FigureBox<?> pudelko;

        pudelko = metoda();


        FigureBox<Object> jdsah = metoda2(new FigureBox<Object>());
        FigureBox<Figure> rt = metoda2(new FigureBox<Figure>());
        //FigureBox<Circle> eryt = metoda2(new FigureBox<Circle>());
    }

    public static <T, T2> Pair<T,T2> wrapToPair(T element1, T2 element2) {
        Pair<T, T2> para = new Pair<>();
        para.setElement1(element1);
        para.setElement2(element2);

        return para;
    }

    public static <T extends Figure> void metoda(T a) {

    }

    public static FigureBox<Circle> metoda() {
        FigureBox<Circle> result = new FigureBox<>();
        return result;
    }

    public static FigureBox metoda2(FigureBox<? super Figure> object) {
        return object;
    }

    public static FigureBox metoda3(FigureBox<? extends Figure> object) {
        return object;
    }
}
