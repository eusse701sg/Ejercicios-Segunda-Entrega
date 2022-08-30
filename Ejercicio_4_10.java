import java.util.Scanner;
public class Ejercicio_4_10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        int num_ins = entrada.nextInt();
        int estrato = entrada.nextInt();
        double patrimonio = entrada.nextDouble();
        double base = 50000;

        if(patrimonio>2000000 && estrato>3){
            double matricula = patrimonio*0.03 + base ;
            System.out.println("El estudiante "+nombre+" con número de inscripción "+num_ins+" debe pagar "+matricula);
        }else{
            System.out.println("El estudiante "+nombre+" con número de inscripción "+num_ins+" debe pagar "+base);
        }
    }
}
