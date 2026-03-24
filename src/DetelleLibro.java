public class DetelleLibro {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El senor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Imprimir el valor de las variables
        System.out.println("Titulo del libro: " + tituloLibro);
        System.out.println("Ano de publicacion: " + anioPublicacion);
        System.out.println("Libro disponible: " + libroDisponible);
        System.out.println("Precio del libro: " + precio);

        //Modificar el titulo del libro
        tituloLibro = "El Senor de los Anillos";
        System.out.println("Titulo del libro: " + tituloLibro);
    }
    

}
