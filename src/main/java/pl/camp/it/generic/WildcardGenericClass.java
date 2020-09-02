package pl.camp.it.generic;

public class WildcardGenericClass<T extends Figure, T2 extends Number> {
    T figure;
    T2 number;

    public WildcardGenericClass(T figure, T2 number) {
        this.figure = figure;
        this.number = number;
    }
}
