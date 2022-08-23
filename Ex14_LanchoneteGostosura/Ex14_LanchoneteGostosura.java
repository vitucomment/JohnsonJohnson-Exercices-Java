import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14_LanchoneteGostosura {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite a quantidade de sanduiches: ");
		int quantidadeLanches = input.nextInt();
		
		double pesoQueijo = queijo(quantidadeLanches) / 1000.0;
		double pesoPresunto = presunto(quantidadeLanches) /1000.0;
		double pesoCarne = carne(quantidadeLanches) / 1000.0;
		
		System.out.println("\nPara produzir "+ quantidadeLanches + "sanduiches serão necessarios: " + 
		"\n" + df.format(pesoQueijo) + " kgs de mussarela" + 
		"\n" + df.format(pesoPresunto) + " kgs de presunto" + 
		"\n" + df.format(pesoCarne) + " kgs de hambúrguers");
		
		input.close();
	}
	
	public static int queijo(int quantidadeLanches) {
		int queijo = 100 * quantidadeLanches;
		return queijo;
	}
	
	public static int presunto(int quantidadeLanches) {
		int presunto = 50 * quantidadeLanches;
		return presunto;
	}
	
	public static int carne(int quantidadeLanches) {
		int carne = 120 * quantidadeLanches;
		return carne;
	}
}
