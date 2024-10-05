package ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numero1Base = Math.random() * 50;
        double numero2Base = Math.random() * 50;
        int round1 = (int)(Math.round(numero1Base));
        int round2 = (int)(Math.round(numero2Base));
        int maxNumber = Math.max(round1, round2);
        System.out.println("PRIMER NÚMERO: " + round1 + " - SEGUNDO NÚMERO: " + round2 + " - MAYOR: " + maxNumber);
    }
}
