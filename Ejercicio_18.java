import java.util.Scanner;
public class Ejercicio_18 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.nextLine();
        int codigo = entrada.nextInt();
        double horas_labor = entrada.nextDouble();
        double valor_hora = entrada.nextDouble();
        double porc_retenc = entrada.nextDouble();
        double pago_bruto = horas_labor * valor_hora;
        double retencion = pago_bruto * porc_retenc / 100;
        double pago_neto = pago_bruto - retencion;

        System.out.println("Los datos de usuario son: \n"+"Codigo: "+codigo+"\nNombre: "+ nombre + "\nSalario bruto: " + pago_bruto + "\nSalario neto: " + pago_neto);
        }
    }
