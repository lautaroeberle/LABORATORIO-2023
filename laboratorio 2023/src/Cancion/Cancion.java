package Cancion;

public class Cancion {


    private String titulo;
    private String autor;



    public Cancion () {

        this.autor = "";
        this.titulo = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}