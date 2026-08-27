package vacunas;

public class VacunaFinal {

    private final String marca;
    private final String paisOrigen;
    private final String enfermedadPreviene;
    private final int cantidadDosis;

    public VacunaFinal(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadPreviene = enfermedadPreviene;
        this.cantidadDosis = cantidadDosis;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    public String getEnfermedadPreviene() {
        return this.enfermedadPreviene;
    }

    public int getCantidadDosis() {
        return this.cantidadDosis;
    }
}
