public class Libro {
    String titulo;
    String autor;
    int numPaginas;
    int valoracion;

    public void mostrarInfo(){
        System.out.println("El "+titulo+" tiene "+numPaginas+" páginas.");
        System.out.println("El autor de este libro es +" +autor);
        System.out.println("La valoración de"+titulo+ " es de "+valoracion);
    }
    public Libro(String titulo, String autor, int numPaginas, int valoracion ){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
        this.valoracion=valoracion;
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
}
