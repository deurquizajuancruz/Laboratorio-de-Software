package main.java.practica3;

import java.util.Scanner;

public class InnerStatic {

    static double PI = 3.1416;

    static class Circulo {
        static double radio = new Scanner(System.in).nextDouble();

        static double getArea() {
            var a = PI * Math.pow(radio, 2);
            System.out.println("El area es: " + a);
            return a;
        }

        static double getLongitudCircunsferencia() {
            var l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
    }
}
