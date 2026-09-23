package practica3;

import java.util.List;

public enum FitoPaez {
    INSTANCIA;
    private final InstrumentoMusical piano;

    FitoPaez() {
        this.piano = new Piano();
    }

    public static class NotaConTiempo {
        private final Notas nota;
        private final int tiempo;

        public NotaConTiempo(Notas n, int t) {
            this.nota = n;
            this.tiempo = t;
        }

        public Notas getNota() {
            return this.nota;
        }

        public int getTiempo() {
            return this.tiempo;
        }
    }

    public void tocarCancion(List<NotaConTiempo> cancion) {
        for (NotaConTiempo nt : cancion) {
            this.piano.hacerSonar(nt.getNota(), nt.getTiempo());
        }
    }
}
