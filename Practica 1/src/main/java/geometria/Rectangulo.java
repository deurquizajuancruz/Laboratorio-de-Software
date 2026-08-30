package geometria;

import java.io.Serial;

public final class Rectangulo extends FiguraGeometrica {
    private int alto, ancho;
    @Serial
    private static final long serialVersionUID = 1L;

    public Rectangulo(String color, int alto, int ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un Rectangulo con " + this.alto + " de alto y " + this.ancho + " de ancho de color " + this.getColor());
    }

    @Override
    public int area() {
        return this.ancho * this.alto;
    }

    @Override
    public boolean isCirculo() {
        return false;
    }
}
