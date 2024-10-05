package ClasesOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int numeroUno = 8;
        int numeroDos = 2;
        System.out.println("VALORES INICAILES: numeroUno = " + numeroUno + " numeroDos = " + numeroDos);
        int AUX = numeroUno;
        numeroUno = numeroDos;
        numeroDos = AUX;
        System.out.println("Valores intercambiados: numeroUno = " + numeroUno + "   numeroDos = " + numeroDos);
        
    }
}
