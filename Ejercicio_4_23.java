import java.util.Scanner;
public class Ejercicio_4_23 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        double raiz_1 = (- b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        double raiz_2 = (- b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        System.out.println(raiz_1);
        System.out.println(raiz_2);
    }
}
