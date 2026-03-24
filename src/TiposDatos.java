public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos en Java
        //Enteros (Su valor default es 0
        byte tipoByte = 127;
        System.out.println("tipoByte: " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort: " +tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipopInt: " + tipoInt);
        long tipoLong = 987654321098763211L; // L o l para indicar tipo Long
        System.out.println("tipoLong: " + tipoLong);

        //Punto flotante (Valor default 0.0)
        float tipoFloat =3.14F; //F o f para indicar tipo Float
        System.out.println("tipoFloat: " + tipoFloat);
        double tipoDouble = 3.1315D; //D o d para inidcar tipo Double (opcional)
        System.out.println("tipoDouble: " + tipoDouble);

        //Caracter (Valor default '\u0000')
        char tipoChar = 'A'; // Caracter del juego unicode
        System.out.println("tipoChar: " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar: " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar: " + tipoChar);

        //Booleano (Valor default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean: " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean: " + tipoBoolean);

        //Tipos Object (Referencia)
        String nombre = null; // Valor default null para objetos
        System.out.println("nombre: " + nombre);
        nombre = "Samahel Thomas";
        System.out.println("nombre: " + nombre);
        

    }
}
