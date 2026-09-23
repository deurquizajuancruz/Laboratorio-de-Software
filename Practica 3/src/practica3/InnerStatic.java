package practica3;

import static java.lang.Math.pow;

public class InnerStatic {

    static final double PI = 3.1416;

    static class Circulo {
        private final double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        double getArea() {
            return PI * pow(this.radio, 2);
        }

        double getLongitudCircunferencia() {
            return 2 * PI * this.radio;
        }
    }
}
