public class MainLibro {
    public static void main(String[] args) {
        //Atributos del libro1
        Libro libro1 = new Libro("La vida es dura","Iván Sanz",500,2,2);
        Libro libro3 = new Libro("La vida es dura","Iván Sanz",500,2,4);
        //Atributos del libro2
        Libro libro2 = new Libro("The jungle","Massamagrell",1000,10,6);

        if (libro2.equals((libro1))){
            System.out.println("Són iguales.");
        }else {
            System.out.println("Son diferentes.");
        }
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
