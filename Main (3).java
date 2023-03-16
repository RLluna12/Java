/******************************************************************************
Triangulo
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	Triangulo x = new Triangulo(3,4,5);
	
	if(x.formaTriangulo() == 0){
	    System.out.println("Os valores nao formam um triangulo");
	 }
	 else{
	     System.out.println("Os valores formam um triangulo");
	 }
	}
}
