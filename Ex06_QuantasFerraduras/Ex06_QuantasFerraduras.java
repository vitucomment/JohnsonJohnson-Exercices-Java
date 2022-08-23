import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06_QuantasFerraduras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Informe a quantidade de cavalos: ");
		int quantidadeDeCavalos = input.nextInt();
		System.out.print("Informe o valor de cada ferradura: R$ ");
		double valorDeCadaFerradura = input.nextDouble();
		System.out.println("");
		
		int quantidadeDeFerradurasCalculada = quantidadeDeFerraduras(quantidadeDeCavalos);
		double valorDeFerradurasCalculado = valorDasFerraduras(quantidadeDeFerradurasCalculada, valorDeCadaFerradura);
		
		System.out.println("A quantidade de ferraduras necessarias: " + quantidadeDeFerradurasCalculada);
		System.out.println("Valor total para a compra das ferraduras: R$ " + df.format(valorDeFerradurasCalculado));
		
		input.close();
	}
	
	public static int quantidadeDeFerraduras(int quantidadeDeCavalos) {
		int quantidadeDeFerraduras = quantidadeDeCavalos * 4;
		return quantidadeDeFerraduras;
	}
	
	public static double valorDasFerraduras(int quantidadeDeFerradurasCalculada, double valorDeCadaFerradura) {
		double valorTotalDeFerraduras = quantidadeDeFerradurasCalculada * valorDeCadaFerradura;
		return valorTotalDeFerraduras;
	}
}
