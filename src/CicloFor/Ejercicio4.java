package CicloFor;
import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args) {
        
        // 4. Desarrollar un programa que realice la sumatoria de todas las 
        // iteraciones de un ciclo desde 0 hasta un número entero definido 
        // previamente, al resultado de la suma realizar las siguientes 
        // operaciones.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número");
        int number = input.nextInt();
        int sum = 0;

        System.out.println("TU NÚMERO: " + number);

        for (int i = 0; i < number + 1; i++) {
            sum += i;
        }

        // Raíz cuadrada 
        double raiz = Math.sqrt(sum);
        System.out.println("RAIZ CUADRADA: " + raiz);

        // Número aleatorio
        int ale = (int) (Math.random() * sum) + 1; 
        System.out.println("ALEATORIO: " + ale);

    }
}
