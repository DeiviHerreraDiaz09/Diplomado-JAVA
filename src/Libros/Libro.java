package Libros;

public class Libro {

    private String autor;
    private String titulo;
    private int paginas;

    public Libro() {
    }

    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println(
                "El libro " + this.titulo + ", del autor " + this.autor + ", tiene " + this.paginas + " páginas");
    }

    public void compararLibros(Libro libro1, Libro libro2) {

        int paginas1 = libro1.getPaginas();
        int paginas2 = libro2.getPaginas();

        if (paginas1 > paginas2) {
            System.out.println("Libro: " + libro1.getTitulo() + " tiene " + libro1.getPaginas() + " páginas");
        } else {
            System.out.println("Libro: " + libro2.getTitulo() + " tiene " + libro2.getPaginas() + " páginas");
        }

    }

}
