package geometria;
import java.util.Arrays;

public class PaintTest {

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        String imprimir = "";
        Arrays.sort(paint.getPaleta(), (a1, a2) -> Integer.compare(a1.area(), a2.area()));
        for (FiguraGeometrica figura : paint.getPaleta()) {
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
