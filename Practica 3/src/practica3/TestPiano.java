package practica3;

import java.util.*;

public class TestPiano {

    public static void main(String[] args) {
        Piano piano = new Piano();
        System.out.println("Soy un... " + piano.queEs());
        piano.hacerSonar();
        Random r = new Random();
        for (Notas n : Notas.values()) {
            piano.hacerSonar(n, r.nextInt(0, 100));
        }
        for (FrecuenciasDeLA f : FrecuenciasDeLA.values()) {
            piano.afinar(f);
        }
        List<FitoPaez.NotaConTiempo> canciones = List.of(
                new FitoPaez.NotaConTiempo(Notas.DO, 4),
                new FitoPaez.NotaConTiempo(Notas.FA, 92),
                new FitoPaez.NotaConTiempo(Notas.MI, 66)
        );
        FitoPaez.INSTANCIA.tocarCancion(canciones);
    }
}
