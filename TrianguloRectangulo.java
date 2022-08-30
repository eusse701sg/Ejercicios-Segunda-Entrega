public class TrianguloRectangulo {
    double base;
    double altura;
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double CalcularArea() {
        return (base * altura) / 2;
    }
    double CalcularPerimetro() {
        return base + altura + CalcularHipotenusa();
    }
    double CalcularHipotenusa() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }
    void DeterminarTipoTriangulo() {
        if ((base == altura) && (base == CalcularHipotenusa()) && (altura == CalcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero.");
        } else if ((base != altura) && (base != CalcularHipotenusa()) && (altura != CalcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno.");
        } else {
            System.out.println("Es un triángulo isósceles.");
        }
    }
}