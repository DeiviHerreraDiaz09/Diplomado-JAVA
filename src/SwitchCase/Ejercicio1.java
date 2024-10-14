package SwitchCase;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // 1. Desarrolla un programa donde por medio del tipo de un motor,
        // determinar qué tipo de fluido puede trasportar éste según las siguientes
        // condiciones: - Si el tipo de motor es 0, mostrar un mensaje por consola
        // indicando “No
        // hay establecido un valor definido para el tipo”. -
        // Si el tipo de motor es 1, mostrar un mensaje por consola indicando
        // “Agua”. - Si el tipo de motor es 2, mostrar un mensaje por consola indicando
        // “Gasolina”. - Si el tipo de motor es 3, mostrar un mensaje por consola
        // indicando
        // “Hormigón”. - Si no se cumple ninguno de los valores anteriores mostrar el
        // mensaje
        // “No existe un valor válido”.

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Escriba el tipo de motor que tiene: ");
            int motor = input.nextInt();

            switch (motor) {

                case 0:
                    System.out.println("No hay establecido un valor definido para el tipo");
                    break;

                case 1:
                    System.out.println("Agua");
                    break;

                case 2:
                    System.out.println("Gasolina");
                    break;

                case 3:
                    System.out.println("Hormigón");
                    break;

                default:
                    System.out.println("No existe un valor válido");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}
