import java.util.Scanner;
public class Ejercicio_4_24 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double esfera_1 = entrada.nextDouble();
        double esfera_2 = entrada.nextDouble();
        double esfera_3 = entrada.nextDouble();
        if ((esfera_1 > esfera_2) && (esfera_1 > esfera_3)){
            System.out.println("La esfera de mayor peso es la esfera 1.");
        } else if ((esfera_2 > esfera_1) && (esfera_2 > esfera_3)) {
            System.out.println("La esfera de mayor peso es la esfera 2.");
        } else if ((esfera_3 > esfera_1) && (esfera_3 > esfera_2)) {
            System.out.println("La esfera de mayor peso es la esfera 3.");
        }
    }
}
