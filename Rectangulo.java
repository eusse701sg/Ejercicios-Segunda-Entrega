public class Rectangulo{
    int base;
    int altura;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    double CalcularArea(){
        return base * altura;
    }
    double CalcularPerimetro(){
        return 2*(base+altura);
    }
}

