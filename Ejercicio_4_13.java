import java.util.Scanner;
public class Ejercicio_4_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor_compra = entrada.nextDouble();
        String color_bol = entrada.next();
        double valor = switch (color_bol) {
            case "verde" -> 0.9 * valor_compra;
            case "amarillo" -> 0.75 * valor_compra;
            case "azul" -> 0.5 * valor_compra;
            case "rojo" -> 0;
            default -> valor_compra;
        } ; System.out.println("El valor total de la compra es "+valor);
    }
}