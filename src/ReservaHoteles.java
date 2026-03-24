public class ReservaHoteles {
    public static void main(String[] args) {
        //Captuar el detalle de la reservacion de hoteles 
        System.out.println(" *** Reservacion de Hoteles ***");

        //Se definen variables para almacenar los detalles de la reservacion
        var nombreCliente = "Samahel Thomas";
        var diasEstancia = 7;
        var tarifaDiaria = 150.75F;
        var habitacionVistaMar = true;

        //Se imprimen los detalles de la reservacion
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de estancia: " + diasEstancia);
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Habitacion con vista al mar: " + habitacionVistaMar);

        //Se modifican las variables 
        nombreCliente = "Derek Thomas";
        diasEstancia = 10;
        tarifaDiaria = 100.75F;
        habitacionVistaMar = false;

        //Se imprimen los detalles de la reservacion actualizados
        System.out.println("\n *** Detalles de la reservacion actualizados ***");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de estancia: " + diasEstancia);
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Habitacion con vista al mar: " + habitacionVistaMar);
    }
    
}
