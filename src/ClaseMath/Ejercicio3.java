package ClaseMath;

public class Ejercicio3 {
    public static void main(String[] args) {        
        int nota1 = ((int)(Math.random() * 10));
        int nota2 = ((int)(Math.random() * 10)); 
        int nota3 = ((int)(Math.random() * 10));
        int nota4 = ((int)(Math.random() * 10)); 
        int nota5 = ((int)(Math.random() * 10));
        int sum = nota1 + nota2 + nota3 + nota4 + nota5;
        double average = sum / 5.0;
        System.out.println("Promedio: " + average);
    }
}
