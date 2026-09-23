package practica3;

import java.util.Arrays;
import java.util.Comparator;

public class EstudianteMain {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("de Urquiza", 19497, "Juan Cruz", 24, 30);
        Estudiante e2 = new Estudiante("Rusconi", 14563, "Pilar", 23, 40);
        Estudiante e3 = new Estudiante("Rodriguez", 47852, "Sebastian", 20, 10);
        Estudiante e4 = new Estudiante("Gutierrez", 20391, "Lautaro", 19, 29);
        Estudiante e5 = new Estudiante("Hernandez", 15874, "Fernando", 60, 20);
        Estudiante e6 = new Estudiante("Rodriguez", 57896, "Rodrigo", 27, 15);
        Estudiante[] estudiantes = {e1, e2, e3, e4, e5, e6};
        System.out.println("Array ordenado por materias aprobadas en orden ascendente: ");
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e1.getMateriasAprobadas() - e2.getMateriasAprobadas();
            }
        });
        imprimir(estudiantes);
        System.out.println("Array ordenado por edad en orden descendente: ");
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e2.getEdad() - e1.getEdad();
            }
        });
        imprimir(estudiantes);
        System.out.println("Array ordenado por legajo en orden ascendente: ");
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e1.getLegajo() - e2.getLegajo();
            }
        });
        imprimir(estudiantes);
        System.out.println("Array ordenado por nombre y apellido en orden descendente: ");
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e2.getNombreyApellido().compareTo(e1.getNombreyApellido());
            }
        });
        imprimir(estudiantes);
    }

    private static void imprimir(Estudiante[] estudiantes) {
        for (Estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
    }
}
