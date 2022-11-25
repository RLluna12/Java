import java.util.Scanner;

public class IMC {
//calcule o IMC e exiba se ele está no peso ideal ou não
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		
		double peso, altura, IMC;
		System.out.println("informe o peso: ");
		 peso = t.nextDouble();
		 System.out.println("Informe a altura: ");
		 altura = t.nextDouble();
		 IMC =peso/(altura*altura);
		 System.out.println(IMC);
		 if (IMC <18.5 || IMC >25) {
			 System.out.println("Fora do peso ideal!");
		 }
		 else {
			 System.out.println("Peso ideal!");
		 }
		 
		 
		
	}
	
}
