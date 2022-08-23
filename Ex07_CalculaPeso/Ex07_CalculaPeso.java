import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07_CalculaPeso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Informe o peso em KG: ");
		double pesoEmKg = input.nextDouble();
		
		mais15(pesoEmKg);
		System.out.println("Caso a pessoa engorde 15% ficara com: "+ df.format(mais15(pesoEmKg)) + " KG");
		System.out.println("Caso a pessoa engorde 20% ficara com: "+ df.format(mais20(pesoEmKg)) + " KG");
		
		input.close();
	}
	
	public static double mais15(double peso) {
		double resultado = peso*1.15;
		return resultado;
	}
	
	public static double mais20(double peso) {
		double resultado = peso * 1.20;
		return resultado;
	}
}
