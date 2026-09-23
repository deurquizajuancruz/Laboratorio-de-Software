package practica3;

import java.util.Scanner;

public class InnerTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextDouble()) {
            InnerStatic.Circulo c = new InnerStatic.Circulo(s.nextDouble());
            System.out.println("Area: " + c.getArea());
            System.out.println("Circunferencia: " + c.getLongitudCircunferencia());
        }
    }
}
