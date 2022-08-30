import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double lado = entrada.nextDouble();
        double perimetro = 3*lado;
        double altura = Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2));
        double area = (lado*altura)/2;
        System.out.println("El perímetro del triángulo es: "+perimetro+"\nLa altura del triángulo es: "+altura+"\nEl área del triángulo es: "+area);

    }
}
