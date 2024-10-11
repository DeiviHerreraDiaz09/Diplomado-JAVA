package CicloFor;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
       // 1. Desarrolla un programa que permita mostrar el factorial de un número definido previamente.

       Scanner input = new Scanner(System.in);
       System.out.println("Escribe un número para su factorial: ");
       int numero = input.nextInt();
       int factorial = 1;
       
       for (int i = numero; i >= 1; i--) {
           factorial *= i;
       }
       System.out.println("El factorial de " + numero + " es: " + factorial);

   }
}
