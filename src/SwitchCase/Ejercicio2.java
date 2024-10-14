package SwitchCase;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        // 2. Desarrollar una calculadora, la cual, en base a un operador, realice una 
        // operación con dos números enteros ya definidos y mostrar el resultado, 
        // los operadores a tener en cuenta son los vistos en la tabla de 
        // operadores aritméticos, sí deseas agregar más operadores, siéntete en 
        // libertad de hacerlo.

        int numberOne = 5;
        int numberTwo = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Escriba alguno de los siguientes operadores: \n 1. + \n 2. - \n 3. x \n 4. /");
        int option = input.nextInt();


        switch (option) {
            case 1:
                float sum = numberOne + numberTwo;
                System.out.println("El resultado de la suma es: " + sum);
                break;
            case 2:
                float subtract = numberTwo - numberOne; 
                System.out.println("El resultado de la resta es: " + subtract);
                break;
            case 3:
                float multiplication = numberOne * numberTwo;
                System.out.println("El resultado de la multiplicación es: " + multiplication);
                break;
            case 4:
                float division = numberTwo / numberOne;
                System.out.println("El resultado de la división es: " + division);
                break;
        
            default:
                System.out.println("Opción digitada incorrectamente");
                break;
        }


    }

}
