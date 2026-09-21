package main.java.practica3;

import java.util.Iterator;

public class MainStack {

    public static void main (String[] args) {
        Stack pila = new Stack();
        pila.push("Hola");
        pila.push("Medio");
        pila.push("Chau");
//        System.out.println(pila.pop());
//        System.out.println(pila.pop());
//        System.out.println(pila.pop());

        Iterator iterator = pila.getIterator();
        System.out.println("Primera iteracion: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
