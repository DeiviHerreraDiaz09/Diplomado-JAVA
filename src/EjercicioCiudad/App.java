package EjercicioCiudad;

public class App {

    public static void main(String[] args) {

        Ciudad ciudadTest = new Ciudad();
        
        ciudadTest.setNombre("Bogotá");
        ciudadTest.setPoblacion(8000000);
        ciudadTest.setPais("Colombia");
        ciudadTest.setPresidente("Gustavo Petro");

        System.out.println("Nombre: " + ciudadTest.getNombre());
        System.out.println("Población: " + ciudadTest.getPoblacion());
        System.out.println("País: " + ciudadTest.getPais());
        System.out.println("Presidente: " + ciudadTest.getPresidente());

    }
}
