package pl.camp.it.generic;

public class Pair<T, T2> {
    private T element1;
    private T2 element2;

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        this.element1 = element1;
    }

    public T2 getElement2() {
        return element2;
    }

    public void setElement2(T2 element2) {
        this.element2 = element2;
    }
}
