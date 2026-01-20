import java.util.Objects;

public class Libro {
   private String titulo;
    private String autor;
    private int numPaginas;
    private int valoracion;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    //Con toString()imprimimos td
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", valoracion=" + valoracion +
                ", isbn=" + isbn +
                '}';
    }

    private int isbn;

    public void mostrarInfo(){
        System.out.println("El "+titulo+" tiene "+numPaginas+" páginas.");
        System.out.println("El autor de este libro es +" +autor);
        System.out.println("La valoración de"+titulo+ " es de "+valoracion);
        System.out.println("ISBN= "+isbn);
    }



    public Libro(String titulo, String autor, int numPaginas, int valoracion, Integer isbn ){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
        this.valoracion=valoracion;
        this.isbn=isbn;
    }
    public void setTitulo(){
        this.titulo= titulo;
    }
    public void setAutor(){
        this.autor= autor;
    }
    public void setNumPaginas(){
        this.numPaginas= numPaginas;
    }
    public void setValoracion(){
        this.valoracion=valoracion;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    public int getValoracion(){
        return valoracion;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
