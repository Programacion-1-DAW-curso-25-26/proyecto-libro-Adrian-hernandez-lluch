import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;

public class MainLibro {
    public static void main(String[] args) {
        //Atributos del libro1
        Libro libro1 = new Libro("La vida es dura","Iván Sanz",500,2,9);
        //Atributos del libro2
        Libro libro2 = new Libro("The jungle","Massamagrell",1000,10,9);

        if (libro2.equals((libro1))){
            System.out.println("Són iguales.");
        }else {
            System.out.println("Son diferentes.");
        }
        System.out.println(libro1);
        System.out.println(libro2);

        ArrayList<Libro>biblioteca=new ArrayList<>();
        biblioteca.add(libro1);
        biblioteca.add(libro2);

        System.out.println(biblioteca.contains(libro2));
        for(Libro l: biblioteca){
            System.out.println(l);
        }
        //true, porque hay un libro en la biblio con el mismo isbn
        HashSet<Libro> casera=new HashSet<>();
        System.out.println(casera.add(libro1));//True
        System.out.println(casera.add(libro2));//false por el hashCode
    }
}
