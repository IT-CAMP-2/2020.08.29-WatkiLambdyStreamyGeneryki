package pl.camp.it.generic;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if(elements.size() < 1) {
            throw new EmptyQueueException();
        }
        T result = elements.get(0);
        elements.remove(0);
        return result;
    }
}
