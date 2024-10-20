package Vectores;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // 1. Desarrollar un programa que por medio de un vector de tipo float permita
        // almacenar el peso de 5 personas
        // para posteriormente: - Determinar el promedio del peso de las 5 personas. -
        // Determinar cuántas personas superar el promedio del peso.
        // - Determinar cuántas personas son inferiores al peso

        float[] persons = new float[5];
        float sum = 0;
        int countPersons = 0;
        int countPersons2 = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Escribe el peso de la persona: " + (i+1));
            float peso = input.nextFloat();
            persons[i] = peso;
        }

        for (float peso : persons) {
            sum += peso;
        }

        float average = sum / 5;

        for (float peso : persons) {
            if(peso > average){
                countPersons++;
            } else {
                countPersons2++;
            }
        }

        System.out.println("PROMEDIO: " + average);
        System.out.println("CONTADOR PERSONAS MAYOR AL PROMEDIO: " + countPersons);
        System.out.println("CONTADOR PERSONAS MENOR AL PROMEDIO: " + countPersons2);

    }
}
