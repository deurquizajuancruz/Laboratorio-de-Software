package geometria;

import java.io.Serial;
import java.io.Serializable;

public abstract sealed class FiguraGeometrica implements Serializable permits Circulo, Rectangulo {
    private String color;
    @Serial
    private static final long serialVersionUID = 1L;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract void dibujar();

    public abstract int area();

    public String getColor() {
        return this.color;
    }

    public abstract boolean isCirculo();
}
