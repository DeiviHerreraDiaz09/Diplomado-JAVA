package Libros;

public class App {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Gabriel Garcia Marquez", "Cien años de soledad", 202);
        Libro libro2 = new Libro("Gabo", "Cien años de compañia", 201);

        libro1.mostrarLibro();
        libro1.compararLibros(libro1, libro2);

    }
}
