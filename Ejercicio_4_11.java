import java.util.Scanner;
public class Ejercicio_4_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        if ((a > b) && (a > c)) {
            System.out.println(a + " es el mayor.");
        }else if ((b > a) && (b > c)){
            System.out.println(b+" es el mayor.");
        }else{
            System.out.println(c+" es el mayor.");
        }
    }
}

