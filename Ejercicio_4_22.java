import java.util.Scanner;
public class Ejercicio_4_22 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        double pago_hora = entrada.nextDouble();
        double horas_mes = entrada.nextDouble();
        double pago_mes = pago_hora * horas_mes;
        if (pago_mes > 450000){
            System.out.println(nombre+" deviene "+pago_mes+" mensualmente.");
        } else{
            System.out.println(nombre);
        }
    }
}
