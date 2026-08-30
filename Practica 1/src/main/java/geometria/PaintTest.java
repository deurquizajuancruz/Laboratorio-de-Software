package geometria;

import java.io.*;
import java.util.Arrays;

public class PaintTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Paint paint = new Paint();
        paint.init();
        String imprimir = "";
        Arrays.sort(paint.getPaleta(), (a1, a2) -> Integer.compare(a1.area(), a2.area()));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("paleta.dat"))) {
            oos.writeObject(paint.getPaleta());
        }

        FiguraGeometrica[] paletaRecuperada;
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("paleta.dat"))) {
            paletaRecuperada = (FiguraGeometrica[]) ois.readObject();
        }

        for (FiguraGeometrica figura : paletaRecuperada) {
            if (figura.isCirculo()) {
                Circulo circulo = (Circulo) figura;
                imprimir += "Soy un circulo con radio " + circulo.getRadio() + "\n";
            } else {
                imprimir += "Soy un rectangulo \n";
            }
            imprimir += "Mi area es: " + figura.area() + "\n";
        }
        System.out.println(imprimir);
    }
}
