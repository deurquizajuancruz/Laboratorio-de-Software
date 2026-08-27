package vacunas;

public class TestVacuna {

    void main() {
        Vacuna vacuna1 = new Vacuna("Phizer", "Eslovaquia", "Dengue", 1);
        Vacuna vacuna2 = new Vacuna("Osde", "Sudafrica", "Sida", 3);
        Vacuna vacuna3 = new Vacuna("Omint", "Montenegro", "Cancer", 2);
        Vacuna vacuna4 = new Vacuna("AstroZeneca", "Francia", "Ebola", 4);
        Vacuna vacuna5 = new Vacuna("Bayer", "Estados Unidos", "Leucemia", 1);
        Vacuna[] vacunas = {vacuna1, vacuna2, vacuna3, vacuna4, vacuna5};

        for (Vacuna v : vacunas) {
            IO.println(v.toString());
        }
        Vacuna vacuna6 = new Vacuna("Bago", "Uruguay", "EPOC", 5);
        IO.println(vacuna1.equals(vacuna6));

        VacunaFinal vacunaFinal1 = new VacunaFinal("Phizer", "Eslovaquia", "Dengue", 1);
        VacunaFinal vacunaFinal2 = new VacunaFinal("Osde", "Sudafrica", "Sida", 3);
        VacunaFinal vacunaFinal3 = new VacunaFinal("Omint", "Montenegro", "Cancer", 2);
        VacunaFinal vacunaFinal4 = new VacunaFinal("AstroZeneca", "Francia", "Ebola", 4);
        VacunaFinal vacunaFinal5 = new VacunaFinal("Bayer", "Estados Unidos", "Leucemia", 1);
        VacunaFinal[] vacunaFinals = {vacunaFinal1, vacunaFinal2, vacunaFinal3, vacunaFinal4, vacunaFinal5};
        // vacunaFinals[0].cantidadDosis = 5;
    }
}