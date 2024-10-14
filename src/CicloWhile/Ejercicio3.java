package CicloWhile;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Definir las vocales y el texto donde contar.
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String text = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas "
                    + "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. "
                    + "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie "
                    + "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea "
                    + "non proin aliquet scelerisque nam maecenas elit cum.";

        int count = 0;
        int i = 0;

        while (i < text.length()) {
            char c = text.charAt(i);

            // Sintaxis de For Each - estudiar e implementar

            for (char vocal : vocales) {
                if (c == vocal) {
                    count++;
                    break; 
                }
            }

            i++;
        }

        System.out.println("El número total de vocales es: " + count);
    }

}
