package CicloWhile;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 2. Desarrollar un programa que determine si una palabra establecida previamente es o no palíndroma.
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String word = input.nextLine();
        String newWord = "";
        int i = 0;

        while (i < word.length()) {
            char character = word.charAt(word.length() - 1 - i);
            newWord += character;
            i += 1;
        }

        if (!word.equals(newWord)) {
            System.out.println("Tu palabra no es palíndroma");
            return;
        }

        System.out.println("Tu palabra es palíndroma :D");
    }
}
