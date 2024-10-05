package ClasesOperadores;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        int ladoCuadrado = 8;
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        double areaCuadrado = Math.pow(ladoCuadrado, 2);
        int perimetroCuadrado = ladoCuadrado * 4;

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2; 
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
    
        System.out.println("CUADRADO - AREA: " + areaCuadrado + " - PERIMETRO: " + perimetroCuadrado);
        System.out.println("TRIANGULO - AREA: " + areaTriangulo + " - PERIMETRO: " + perimetroTriangulo);
        System.out.println("RECTANGULO - AREA: " + areaRectangulo + " - PERIMETRO: " + perimetroRectangulo);
    

    }
}
