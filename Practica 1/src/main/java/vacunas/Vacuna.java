package vacunas;

public class Vacuna {

    private String marca;
    private String paisOrigen;
    private String enfermedadPreviene;
    private int cantidadDosis;

    public Vacuna(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadPreviene = enfermedadPreviene;
        this.cantidadDosis = cantidadDosis;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getEnfermedadPreviene() {
        return this.enfermedadPreviene;
    }

    public void setEnfermedadPreviene(String enfermedadPreviene) {
        this.enfermedadPreviene = enfermedadPreviene;
    }

    public int getCantidadDosis() {
        return this.cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    @Override
    public String toString() {
        StringBuffer infoVacuna = new StringBuffer();
        infoVacuna.append("Marca: ").append(this.marca).append("\n");
        infoVacuna.append("País de origen: ").append(this.paisOrigen).append("\n");
        infoVacuna.append("Enfermedad que previene: ").append(this.enfermedadPreviene).append("\n");
        infoVacuna.append("Cantidad de dosis: ").append(this.cantidadDosis).append("\n");
        return infoVacuna.toString();
    }
}