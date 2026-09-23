package practica3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class Stack {
    private java.util.ArrayList<Object> items;

    public Stack() {
        this.items = new ArrayList<Object>();
    }

    public void push(Object item) {
        this.items.add(item);
    }

    public Object pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.items.removeLast();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public Iterator<Object> getIterator() {
        return new Iterator<Object>() {
            private int index = 0;

            public boolean hasNext() {
                return Stack.this.items.size() > index;
            }

            public Object next() {
                Object o = Stack.this.items.get(index);
                this.index++;
                return o;
            }
        };
    }
}
