package vacunas;

public class VacunaPatogenoIntegro extends Vacuna {
    private String virusPatogenoInactivado;

    public VacunaPatogenoIntegro(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, String virusPatogenoInactivado) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.virusPatogenoInactivado = virusPatogenoInactivado;
    }

    public String getVirusPatogenoInactivado() {
        return this.virusPatogenoInactivado;
    }

    public void setVirusPatogenoInactivado(String virusPatogenoInactivado) {
        this.virusPatogenoInactivado = virusPatogenoInactivado;
    }
}
