package Variables;

public class Variables {
    public static void main(String[] args) {
        
        // - PRIMITIVOS ENTEROS

        // byte: Emplea un sólo byte(8 bits) de almacenamiento
        // Esto permite almacenar valores entre [-128, 127]
        byte numeroByte = 9;

        // short: Emplea el doble almacenamiento de (byte)
        // Esto permite almacenar valores entre [-32.768, 32.767]
        short numeroShort = 32676;

        // int: Emplea un tamaño mayor, 4 bytes(32 bits).
        // Esto permite almacenar valores entre [-2147483648, 2147483647]
        int numeroInt = 41825;

        // long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits).
        // Esto permite almacenar valores entre [-9223372036854775808, 9223372036854775808]
        long numeroLong = 922337203;


        // - FLOTANTES

        // float: Emplea un tamaño de 32 bits (4 bytes)
        // Esto permite almacenar valores entre [-3.4028234E+8, 1.40239876E-45].

        float numeroFloat = 5976464F;

        // double: Emplea un tamaño de 64 bits (8 bytes).
        // Esto permite almacenar valores entre [-1.7976931348623157E+309, 4.94065645841246544E-324]

        double numeroDouble = 2654792142475F;

        // - BOOLEANOS && CARACTERES

        // boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos (booleanos).
        // Se traducen sus valores en true/false

        boolean variableBoolean = true;

        // char: Se emplea para almacenar caracteres individuales (letras, aunque puede contener números).
        // Utiliza 16 bits y se códifica sobre UTF-16 Unicode

        char numeroChar = 1;
        char letraChar = 'D';

        // - CADENA DE CARACTERES

        // String: Se emplea creando una instancia de la clase String,
        // aunque parezca trabajar con datos primitivos.

        String variableString = "Hola a todos";

        // - ARRAYS

        // Vector - Arreglo: Se emplea para almacenar
        // un grupo de datos del mismo tipo.

        // Forma 1: 
        int vectorNumeros1[] = new int[10];
        // Forma 2:
        int []vectorNumeros2 = new int[10];
        // Forma 3:
        int[] vectorNumeros3 = new int[10];
        // Forma 4:
        int vectorNumeros4[];
        // Forma 5:
        int vectorNumeros5[] = {};
        // Forma 6:
        int vectorNumeros6[] = {9,8,7,6,5,4,3,2,1,0};
        // Forma 7:
        int vectorNumeros7[] = new int[]{9,8,7,6,5,4,3,2,1,0};
  
        // PROXIMAMENTE OBJETOS
    }
}
