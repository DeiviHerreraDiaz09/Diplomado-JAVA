package CicloFor;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // 2. Desarrollar un programa que determine los divisores de un número definido previamente

        // Esto es una lista dinamica, para inicializar un array sin limites. 
        // el cual se puede adecuar de tamaño posteriormente a sus inyecciones
        ArrayList<Integer> divisores = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número para sus divisores");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            
            if (number % i == 0){
                divisores.add(i);
            }
        }

        System.out.println("Los divisores del nuúmero " + number + " son: " + divisores);
    }
}
