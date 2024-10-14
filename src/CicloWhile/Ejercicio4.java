package CicloWhile;
import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {

        // 4. Desarrollar un programa que continúe con la serie sumatoria de 11 – 
        // 22 – 33 – 44. Debe mostrar únicamente los primeros 25 valores de la 
        // serie.

        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;
        int sum = 0; 

        while (i < 25) {
            sum += 11;
            numbers.add(sum);
            i++;
        }

        System.out.println(numbers);

    }
}
