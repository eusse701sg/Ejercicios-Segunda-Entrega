public class PruebaFiguras{
    public static void main(String[] args){

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        RomboRegular figura5 = new RomboRegular(3,5);
        Trapecio figura6 = new Trapecio(6,4,3);

        System.out.println("El área del círculo es: " + figura1.CalcularArea());
        System.out.println("El perímetro del círculo es: " + figura1.CalcularPerimetro());

        System.out.println("El área del rectángulo es: " + figura2.CalcularArea());
        System.out.println("El perímetro del rectángulo es: " + figura2.CalcularPerimetro());

        System.out.println("El área del cuadrado es: " + figura3.CalcularArea());
        System.out.println("El perímetro del cuadrado es: " + figura3.CalcularPerimetro());

        System.out.println("El área del triángulo rectángulo es: " + figura4.CalcularArea());
        System.out.println("El perímetro del triángulo rectángulo es: " + figura4.CalcularPerimetro());
        System.out.println("La hipotenusa del triángulo rectángulo es: " + figura4.CalcularHipotenusa());
        figura4.DeterminarTipoTriangulo();

        System.out.println("El área del rombo regular es: " + figura5.CalcularArea());
        System.out.println("El perímetro del rombo regular es: " + figura5.CalcularPerimetro());
        System.out.println("La diagonal menor del rombo regular es: " + figura5.CalcularDiagonalPrinc());

        System.out.println("El área del trapecio es: " + figura6.CalcularArea());
        System.out.println("El perímetro del trapecio es: " + figura6.CalcularPerimetro());
    }
}

