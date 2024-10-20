package Casa;

public class App {

    public static void main(String[] args) {

        Casa casa1 = new Casa("Bogotá", "Chapinero", "Blanco");
        System.out.println("Casa 1:");
        System.out.println("Ciudad: " + casa1.getCiudad());
        System.out.println("Barrio: " + casa1.getBarrio());
        System.out.println("Color: " + casa1.getColor());
        System.out.println();

        Casa casa2 = new Casa("Teusaquillo", "Rojo", 2);
        System.out.println("Casa 2:");
        System.out.println("Barrio: " + casa2.getBarrio());
        System.out.println("Color: " + casa2.getColor());
        System.out.println("Pisos: " + casa2.getPisos());
        System.out.println();

        Casa casa3 = new Casa(3, 5, 3, 2);
        System.out.println("Casa 3:");
        System.out.println("Pisos: " + casa3.getPisos());
        System.out.println("Habitaciones: " + casa3.getHabitaciones());
        System.out.println("Baños: " + casa3.getBaños());
        System.out.println("Cocinas: " + casa3.getCocinas());
    }
}
