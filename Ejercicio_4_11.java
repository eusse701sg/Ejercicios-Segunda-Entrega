import java.util.Scanner;
public class Ejercicio_4_11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        if(a>b){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            } else if(a>c){
                System.out.println(a+">"+c+">"+b);
            }else{
                System.out.println(c+">"+a+">"+b);
            }
        }else if(b>a){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            } else if (b>c) {
                System.out.println(b+">"+c+">"+a);
            }else{
                System.out.println(c+">"+b+">"+a);
            }
        }
        }
    }

