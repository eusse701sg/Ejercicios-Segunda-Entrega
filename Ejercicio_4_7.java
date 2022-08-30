import java.util.Scanner;
public class Ejercicio_4_7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        if(a<b){
            System.out.print(b+" es mayor que "+a);
        }else if(a==b){
            System.out.println(a+" es igual a "+b);
        }else{
            System.out.println(a+" es mayor que "+b);
        }
    }
}
