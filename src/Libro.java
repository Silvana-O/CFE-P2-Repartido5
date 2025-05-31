public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {

        int anioActual = 2025;
        if(anioPublicacion > anioActual){
            System.out.println("El año de publicación no puede ser mayor al año actual.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public static void main(String[] args) {

        Libro L1 = new Libro("La Tregua", "Mario Benedetti", 1960);

        System.out.println("Libro: " + L1.getTitulo() + ", Autor: " + L1.getAutor() + ", publicado en " + L1.getAnioPublicacion() + ".");
    }
}
