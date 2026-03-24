public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("Nombre 1: " + nombre1);

        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("Nombre 2: " + nombre2);
        
        //Definir otras variables con var
        var edad = 30; //Se infiere tipo int
        System.out.println("Edad: " + edad);
        var sueldo = 5000.50F; //Se infiere tipo float
        System.out.println("Sueldo: " + sueldo);
        var esCasado = false; //Se infiere tipo boolean
        System.out.println("Es casado: " + esCasado);
        esCasado = true; //Se puede modificar el valor de la variable
        System.out.println("Es casado: " + esCasado);
        //esCasado = "No"; //Error, no se puede asignar un valor de tipo String a una variable de tipo boolean

        //Se debe definir el valor 
       //var precio; esto lanza un error, tenemos que asignar un valor
        //precio = 10;

        //Se debe poder inferir el tipo de dato
        //var apellido = null; no se puede inferir el tipo de dato
         
    }
}
