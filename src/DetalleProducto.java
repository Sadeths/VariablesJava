public class DetalleProducto {
    public static void main(String[] args) {
        // Crear variables para almacenar el detalle de un producto en una tienda en linea
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");

        //Se definen variables
        String nombreProducto = "Creatina Monohidratada";
        float precio = 225.99F;
        int cantidadDisponible = 122;
        boolean disponible = true;

        //Se imprimen las variables
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);

        //Se modifican el valor de las variables
        nombreProducto = "Proteina Whey";
        precio = 600.45F;
        cantidadDisponible = 0;
        disponible = false;

        //Se imprimen las variables con los nuevos valores
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);

        
    }
    
}
