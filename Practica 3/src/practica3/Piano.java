package practica3;

public class Piano implements InstrumentoMusical {
    @Override
    public void hacerSonar() {
        System.out.println("Tocando el piano");
    }

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Tocando la nota " + n + " (" + n.getNota() + ") por " + duracion + " segundos");
    }

    @Override
    public String queEs() {
        return "Piano";
    }

    @Override
    public void afinar(FrecuenciasDeLA f) {
        System.out.println("Afinando a " + f.getHz() + "HZ (" + f.getDescripcion() + ")");
    }
}
