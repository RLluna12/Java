
package uscs;


public class Circulo implements FormaGeometrica{
    
    public double raio;
    
    @Override
    public double area(double pi, double raio){
        this.raio = raio;
        return pi*raio*raio;
    }
    @Override
    public double comprimento(double pi, double raio){
        return 2*pi*raio;
    }
    
}
