package geometria;

public abstract sealed class  FiguraGeometrica permits Circulo, Rectangulo {
    private String color;

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
