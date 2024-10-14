package CicloWhile;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. Desarrolla un programa que permita invertir la palabra “Programación”.
        // El resultado debe ser “nóicamargorP”.
        String word = "Programación";
        String newWord = "";
        int i = 0;

        while (i < word.length()) {
            char character = word.charAt(word.length() - 1 - i);
            newWord += character;
            i += 1;
        }

        System.out.println(newWord); 
    }
}
