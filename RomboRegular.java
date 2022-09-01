public class RomboRegular {
    double lado;
    double diagonal;
    public RomboRegular (double lado, double diagonal){
        this.lado = lado;
        this.diagonal = diagonal;
    }
    double CalcularArea(){
        return (CalcularDiagonalPrinc() * diagonal)/2;
    }
    double CalcularDiagonalPrinc(){
        return Math.sqrt((4*Math.pow(lado,2))-Math.pow(diagonal,2));
    }
    double CalcularPerimetro(){
        return 4 * lado;
    }
}
