package ClaseMath;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [] numeros = { 2, 8, 9, 27, 28, 55, 121 };
        for (int i = 0; i < numeros.length; i++) {
            double raiz = Math.sqrt(numeros[i]);
            System.out.println("La raíz cuadrada de " + numeros[i] + " es " + raiz);
        }
    }
}
