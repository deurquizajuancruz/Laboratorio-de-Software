package hashset;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class GenericSet<E> implements Set<E> {
    protected Set<E> datos;

    protected GenericSet(Set<E> datos) {
        this.datos = datos;
    }

    @Override
    public int size() {
        return this.datos.size();
    }

    @Override
    public boolean isEmpty() {
        return this.datos.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.datos.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.datos.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.datos.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.datos.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return this.datos.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.datos.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.datos.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modificado = false;
        for (E e : c) {
            if (add(e)) {
                modificado = true;
            }
        }
        return modificado;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.datos.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modificado = false;
        for (Object o : c) {
            if (remove(o)) {
                modificado = true;
            }
        }
        return modificado;
    }

    @Override
    public void clear() {
        this.datos.clear();
    }

    @Override
    public String toString() {
        return this.datos.toString();
    }
}
