package practica3;

public enum FrecuenciasDeLA {
    ISO16(440, "Organización Internacional de Estandarización ISO 16"),
    CAMARA(444, "Afinación de cámara"),
    RENACIMIENTO(446, "Renacimiento"),
    BACH(480, "Órganos alemanes que tocaba Bach");

    private int hz;
    private String descripcion;

    FrecuenciasDeLA(int hz, String descripcion) {
        this.hz = hz;
        this.descripcion = descripcion;
    }

    public int getHz() {
        return this.hz;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
