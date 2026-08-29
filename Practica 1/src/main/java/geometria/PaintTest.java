package geometria;

public class PaintTest {

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        String imprimir = "";
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
