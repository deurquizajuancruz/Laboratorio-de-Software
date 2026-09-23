package practica3;

public class Estudiante {
    private String apellido,nombre;
    private int edad, legajo, materiasAprobadas;

    public Estudiante(String apellido, int legajo, String nombre, int edad, int materiasAprobadas) {
        this.apellido = apellido;
        this.legajo = legajo;
        this.nombre = nombre;
        this.edad = edad;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    public String getNombreyApellido() {
        return this.getNombre() + this.getApellido();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", materiasAprobadas=" + materiasAprobadas +
                '}';
    }
}
