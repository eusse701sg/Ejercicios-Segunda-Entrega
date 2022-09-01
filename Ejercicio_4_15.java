import java.util.Scanner;
public class Ejercicio_4_15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double bola_a = entrada.nextDouble();
        double bola_b = entrada.nextDouble();
        double bola_c = entrada.nextDouble();
        double bola_d = entrada.nextDouble();
        if ((bola_a == bola_b) && (bola_a == bola_c)) {
            if (bola_a > bola_d) {
                System.out.println("La esfera D es diferente y es de menor peso.");
            } else {
                System.out.println("La esfera D es diferente y es de mayor peso.");
            }
        } else if ((bola_a == bola_b) && (bola_a == bola_d)) {
            if (bola_a > bola_c) {
                System.out.println("La esfera C es diferente y es de menor peso.");
            } else {
                System.out.println("La esfera C es diferente y es de mayor peso.");
            }
        } else if ((bola_a == bola_d) && (bola_a == bola_c)){
            if (bola_a > bola_b) {
                System.out.println("La esfera B es diferente y es de menor peso.");
            } else {
                System.out.println("La esfera B es diferente y es de mayor peso.");
            }
        }else {
            if (bola_c > bola_a) {
                System.out.println("La esfera A es diferente y es de menor peso.");
            } else {
                System.out.println("La esfera A es diferente y es de mayor peso.");
            }
        }
    }
}
