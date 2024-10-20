package Casa;

public class Casa {

    private String ciudad;
    private String barrio;
    private String color;
    private int pisos;
    private int habitaciones;
    private int baños;
    private int cocinas;

    public Casa() {}

    public Casa(String ciudad, String barrio, String color) {
        this.ciudad = ciudad; 
        this.barrio = barrio;
        this.color = color;
    }

    public Casa(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public Casa(int pisos, int habitaciones, int baños, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.cocinas = cocinas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public int getPisos() {
        return pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBaños() {
        return baños;
    }

    public int getCocinas() {
        return cocinas;
    }
}
