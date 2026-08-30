package hashset;

import java.util.*;

public class HashSetAgregados<E> implements Set<E> {

    private final Set<E> datos;
    private int cantidadAgregados = 0;

    public HashSetAgregados() {
        this.datos = new HashSet<>();
    }

    public HashSetAgregados(int initCap, float loadFactor) {
        this.datos = new HashSet<>(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        boolean agregado = this.datos.add(e);
        if (agregado) {
            this.cantidadAgregados++;
        }
        return agregado;
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

    public int getCantidadAgregados() {
        return this.cantidadAgregados;
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
    public boolean remove(Object o) {
        return this.datos.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.datos.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.datos.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.datos.removeAll(c);
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