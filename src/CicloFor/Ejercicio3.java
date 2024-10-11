package CicloFor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // 3. Desarrollar un programa que permita definir si un 
        // número entero ya establecido es un número perfecto o no. 

        ArrayList<Integer> divisores = new ArrayList<>();
        int sum = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            
            if (number % i == 0){
                divisores.add(i);
            }
        }

        for (int i = 0; i < divisores.size(); i++) {
            sum += divisores.get(i);
        }
        
        if (sum != number) {
            System.out.println("Su número no es perfecto");
            return;
        } 
        System.out.println("Su número es perfecto");
    }
}
