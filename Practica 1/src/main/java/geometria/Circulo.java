package geometria;

import java.io.Serial;
import java.lang.Math;

import static java.lang.Math.pow;

public final class Circulo extends FiguraGeometrica {
    private int radio;
    @Serial
    private static final long serialVersionUID = 1L;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un circulo de radio " + this.radio + " y de color" + this.getColor());
    }

    public int getRadio() {
        return this.radio;
    }

    @Override
    public int area() {
        return (int) (Math.PI * pow(this.radio, 2));
    }

    @Override
    public boolean isCirculo() {
        return true;
    }
}
