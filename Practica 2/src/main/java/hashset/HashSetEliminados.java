package hashset;

import java.util.Set;

public class HashSetEliminados<E> extends GenericSet<E> {
    private int cantidadEliminados;

    protected HashSetEliminados(Set<E> datos) {
        super(datos);
        this.cantidadEliminados = 0;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            this.cantidadEliminados++;
        }
        return removed;
    }

    public int getCantidadEliminados() {
        return this.cantidadEliminados;
    }
}
