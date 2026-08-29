package vacunas;

public class VacunaGenetica extends Vacuna {
    private float temperaturaMinima;
    private float temperaturaMaxima;

    public VacunaGenetica(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, float temperaturaMinima, float temperaturaMaxima) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public float getTemperaturaMinima() {
        return this.temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public float getTemperaturaMaxima() {
        return this.temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
}
