import java.util.Scanner;
public class Ejercicio_4_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ventas_dpto_1 = entrada.nextDouble();
        double ventas_dpto_2 = entrada.nextDouble();
        double ventas_dpto_3 = entrada.nextDouble();
        double salario_emp = entrada.nextDouble();
        double ventas_tot = 0.33 * (ventas_dpto_1 + ventas_dpto_2 + ventas_dpto_3);
        double salario_1;
        double salario_2;
        double salario_3;

        if (ventas_dpto_1 > ventas_tot) {
            salario_1 = 1.2 * salario_emp;
        } else {
            salario_1 = salario_emp;
        } System.out.println("El salario de los vendedores del departamento 1 es "+ salario_1);
        if (ventas_dpto_2 > ventas_tot) {
            salario_2 = 1.2 * salario_emp;
        } else {
            salario_2 = salario_emp;
        } System.out.println("El salario de los vendedores del departamento 2 es "+ salario_2);
        if (ventas_dpto_3 > ventas_tot) {
            salario_3 = 1.2 * salario_emp;
        } else {
            salario_3 = salario_emp;
        } System.out.println("El salario de los vendedores del departamento 3 es "+ salario_3);
    }
}
