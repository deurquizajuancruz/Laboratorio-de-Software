package practica3;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringConverterSet<E> extends AbstractSet<String> {
    private HashSet<E> set;

    public StringConverterSet(Set<E> set) {
        this.set = new HashSet<E>(set);
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorStringAdapter();
    }

    @Override
    public int size() {
        return this.set.size();
    }

    private class IteratorStringAdapter implements Iterator<String> {
        private final Iterator<E> iterator;

        public IteratorStringAdapter() {
            this.iterator = StringConverterSet.this.set.iterator();
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public String next() {
            return this.iterator.next().toString();
        }
    }
}
