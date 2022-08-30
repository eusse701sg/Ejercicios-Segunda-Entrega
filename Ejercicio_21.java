import java.util.Scanner;
public class Ejercicio_21 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double lado1 = entrada.nextDouble();
        double lado2 = entrada.nextDouble();
        double lado3 = entrada.nextDouble();
        double perimetro = lado1 + lado2 + lado3;
        double semiperim = perimetro/2;
        double area = Math.sqrt(semiperim*(semiperim-lado1)*(semiperim-lado2)*(semiperim-lado3)); /* Fórmula
         * del área de un triángulo sin saber su altura * Fórmula de Herón */

        System.out.println("El perímetro del triángulo es: "+perimetro+"\nEl semiperímetro es: "+semiperim+"\nEl área del triángulo es: "+area);

    }
}
