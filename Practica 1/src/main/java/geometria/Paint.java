package geometria;

import java.io.Serial;
import java.io.Serializable;

public class Paint implements Serializable {
    private FiguraGeometrica[] paleta;
    @Serial
    private static final long serialVersionUID = 1L;

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
