public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        final var DIAS_SEMANA = 7;
        System.out.println("Días de la semana: " + DIAS_SEMANA);
         //DIAS_SEMANA = 8; // Esto causará un error de compilación, ya que DIAS_SEMANA es una constante
         final var PI = 3.1416;
        System.out.println("Valor de PI: " + PI);
        System.out.println("Math.PI " + Math.PI);
        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la Univerisdad Java";
        System.out.println("Mensaje de bienvenida: " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("Minutos por segundo: " + MINUTOS_POR_SEGUNDO);

    }
}
