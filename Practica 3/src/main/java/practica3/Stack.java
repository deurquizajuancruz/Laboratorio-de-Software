package main.java.practica3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
    private java.util.ArrayList items;

    public Stack() {
        this.items = new ArrayList<String>();
    }

    public void push(Object item) {
        this.items.add(item);
    }

    public Object pop() {
        Object toBeDeleted = this.items.getLast();
        this.items.remove(toBeDeleted);
        return toBeDeleted;
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public Iterator getIterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return Stack.this.items.size() > index;
        }

        @Override
        public Object next() {
            Object o = Stack.this.items.get(index);
            this.index++;
            return o;
        }
    }
}
