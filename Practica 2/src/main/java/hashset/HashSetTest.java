package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

    static void main() {
        HashSetAgregados<String> hashSetA = new HashSetAgregados<>();
        List<String> coleccion = Arrays.asList("Perro", "Gato", "Vaca", "Pato", "Toro", "Jaguar");
        hashSetA.addAll(coleccion);
        IO.println("Cantidad agregada: " + hashSetA.getCantidadAgregados());
        IO.println("Size del HS: " + hashSetA.size());
        IO.println("Contenido: " + hashSetA);

        HashSetEliminados<String> hashSetE = new HashSetEliminados<>(new HashSet<String>());
        hashSetE.addAll(coleccion);
        hashSetE.remove("Perro");
        IO.println("Cantidad eliminada: " + hashSetE.getCantidadEliminados());
        IO.println("Contenido " + hashSetE);
    }
}
