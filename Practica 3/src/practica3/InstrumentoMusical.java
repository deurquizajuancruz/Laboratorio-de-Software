package practica3;

public interface InstrumentoMusical {
    void hacerSonar();

    void hacerSonar(Notas n, int duracion);

    String queEs();

    default void afinar() {
    }

    default void afinar(FrecuenciasDeLA f) {
    }
}

abstract class InstrumentoDeViento implements InstrumentoMusical {
    public void hacerSonar() {
        System.out.println("Sonar Vientos");
    }

    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Sonar Vientos");
    }

    public String queEs() {
        return "Instrumento de Viento";
    }

}

class InstrumentoDeCuerda implements InstrumentoMusical {
    @Override
    public void hacerSonar() {
        System.out.println("Sonar Cuerdas");
    }

    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Sonar Cuerdas");
    }

    public String queEs() {
        return "Instrumento de Cuerda";
    }

}