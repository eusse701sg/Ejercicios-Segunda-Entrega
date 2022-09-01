import java.util.Scanner;
public class Ejercicio_4_12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        double horas = entrada.nextDouble();
        double pago_hora = entrada.nextDouble();
        if (horas > 40){
            double pago_sin = 40 * pago_hora;
            double horas_ext = horas - 40;
            if(horas_ext <= 8){
                double pago = 2 * horas_ext * pago_hora;
                double salario = pago + pago_sin;
                System.out.println("El trabajador "+nombre+" deviene "+salario);
            }else {
                double pago = (16 * pago_hora) + (3 * (horas_ext - 8) * pago_hora);
                double salario = pago + pago_sin;
                System.out.println("El trabajador "+nombre+" deviene "+salario);
            }
        } else{
            double salario = pago_hora * horas;
            System.out.println("El trabajador "+nombre+" deviene "+salario);
        }
    }
}
