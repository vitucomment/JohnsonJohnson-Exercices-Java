import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01_TerrenosRetangulares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Quantos metros o terreno possui de frente: ");
		double tamanhoFrente = input.nextDouble();
		System.out.print("Quantos metros o terreno possui de lateral: ");
		double tamanhoLateral = input.nextDouble();
		System.out.print("Informe o valor do metro quadrado: ");
		double valorMetroQuadrado = input.nextDouble();
		System.out.println("");

		double areaCalculada = calculaArea(tamanhoFrente, tamanhoLateral);
		double valorTerreno = calculaValorTerreno(areaCalculada, valorMetroQuadrado);

		System.out.print("Area total do terreno de " + df.format(tamanhoFrente) + " mts de frente");
		System.out.println(
				" com " + df.format(tamanhoLateral) + " mts de lateral é: " + df.format(areaCalculada) + " m²");
		System.out.println("O valor deste terreno é: R$ " + df.format(valorTerreno));
		
		input.close();
	}

	public static double calculaArea(double x, double y) {
		double areaCalculada = (x * y);
		return (areaCalculada);
	}

	public static double calculaValorTerreno(double area, double valor) {
		double valorCalculadoTerreno = (area * valor);
		return (valorCalculadoTerreno);
	}
}
