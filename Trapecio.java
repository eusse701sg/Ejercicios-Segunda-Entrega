public class Trapecio {
    double base_mayor, base_menor, altura;
    public Trapecio(double base_mayor,double base_menor, double altura){
        this.altura = altura;
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
    }
    double CalcularArea(){
        return (base_menor + base_mayor) * altura/2;
    }
    double CalcularPerimetro(){
        return base_mayor + base_menor + altura + Math.sqrt(Math.pow(altura,2)-Math.pow(base_mayor-base_menor,2));
    }
}
