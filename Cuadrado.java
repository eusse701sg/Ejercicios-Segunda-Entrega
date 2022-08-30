public class Cuadrado{
    int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    double CalcularArea(){
        return Math.pow(lado,2);
    }
    double CalcularPerimetro(){
        return 4 * lado;
    }

}
