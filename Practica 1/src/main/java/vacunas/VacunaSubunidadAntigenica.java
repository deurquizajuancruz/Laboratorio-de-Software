package vacunas;

public class VacunaSubunidadAntigenica extends Vacuna {
    private int cantidadAntigenos;
    private String proceso;

    public VacunaSubunidadAntigenica(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, int cantidadAntigenos, String proceso) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.cantidadAntigenos = cantidadAntigenos;
        this.proceso = proceso;
    }

    public int getCantidadAntigenos() {
        return this.cantidadAntigenos;
    }

    public void setCantidadAntigenos(int cantidadAntigenos) {
        this.cantidadAntigenos = cantidadAntigenos;
    }

    public String getProceso() {
        return this.proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
}
