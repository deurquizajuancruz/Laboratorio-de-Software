package practica3;

public enum Notas {
    LA("A"),
    SI("B"),
    DO("C"),
    RE("D"),
    MI("E"),
    FA("F"),
    SOL("G");

    private String nota;

    Notas(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return this.nota;
    }
}
