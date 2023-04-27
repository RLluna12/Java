
package uscs;


public class Quadrado implements FormaGeometrica{
    
    public double lado;
    
    @Override
    public double area(double base, double altura){
        return base*altura;
    }
    
    @Override
    public double comprimento(double lado, double perimetro){
       this.lado = lado;
       perimetro = 4*lado;
       return perimetro;
       
    }
    
}
