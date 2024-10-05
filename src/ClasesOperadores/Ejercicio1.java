package ClasesOperadores;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = input.nextLine();
        double nota1 = 5.0;
        double nota2 = 4.0;
        double nota3 = 3.0;
        double nota4 = 2.0;
        double nota5 = 1.0;
        double sum = nota1 + nota2 + nota3 + nota4 + nota5;
        double average = sum / 5.0;
        System.out.println("El promedio del estudiante " + nombre + " es " + average);
        input.close();
        
    }
}
