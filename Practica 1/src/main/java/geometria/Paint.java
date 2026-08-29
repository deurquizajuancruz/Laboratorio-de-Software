package geometria;

public class Paint {
    private FiguraGeometrica[] paleta;

    public Paint() {

    }

    public FiguraGeometrica[] getPaleta() {
        return this.paleta;
    }

    public void init() {
        this.paleta = new FiguraGeometrica[]{
                new Circulo("azul", 2),
                new Circulo("amarillo", 3),
                new Rectangulo("verde", 2, 3),
                new Rectangulo("rojo", 4, 10),
        };
    }
}
