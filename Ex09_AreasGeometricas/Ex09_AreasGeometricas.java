import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09_AreasGeometricas {

	public static void main(String[] args) {

		areaDoTrapezio();
		System.out.println("");
		areaDoQuadrado();
		System.out.println("");
		areaDoRetangulo();
		System.out.println("");
		areaDoCirculo();
		System.out.println("");
		areaDoTriangulo();

	}

	public static int input() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		return userInput;
	}

	public static String formata(double valor) {
		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(valor);
		return formatado;
	}

	public static void areaDoTrapezio() {
		System.out.print("Informe o valor da base maior: ");
		int baseMaior = input();
		System.out.print("Informe o valor da base menor: ");
		int baseMenor = input();
		System.out.print("Informe o valor da altura: ");
		int altura = input();
		double alturaDouble = altura;
		double area = ((baseMaior + baseMenor) * alturaDouble) / 2;
		System.out.println("Area do trapézio:");
		System.out.println("A area do trapézio é: " + formata(area));
	}

	public static void areaDoQuadrado() {
		System.out.print("Informe o valor de um dos lados: ");
		int valorDosLados = input();
		double valorDosLadosDouble = valorDosLados;
		double area = Math.pow(valorDosLadosDouble, 2);
		System.out.println("Area do quadrado:");
		System.out.println("A area do quadrado é: " + formata(area));
	}

	public static void areaDoRetangulo() {
		System.out.print("Informe o valor da largura: ");
		int valorDaLargura = input();
		System.out.print("Informe o valor da altura: ");
		int valorDaAltura = input();
		double valorDaAlturaDouble = valorDaAltura;
		double area = valorDaAlturaDouble * valorDaLargura;
		System.out.println("Area do retangulo:");
		System.out.println("A area do retangulo é: " + formata(area));
	}

	public static void areaDoCirculo() {
		System.out.print("Informe o valor do raio: ");
		int valorDoRaio = input();
		double valorPi = 3.14;
		double area = Math.pow(valorDoRaio, 2) * valorPi;
		System.out.println("Area do circulo:");
		System.out.println("A area do circulo é: " + formata(area));
	}

	public static void areaDoTriangulo() {
		System.out.print("Informe o valor da base: ");
		int valorDaBase = input();
		System.out.print("Informe o valor da altura: ");
		int valorDaAltura = input();
		double valorDaBaseDouble = valorDaBase;
		double area = (valorDaBaseDouble * valorDaAltura) / 2;
		System.out.println("Area do triangulo:");
		System.out.println("A area do triangulo é: " + formata(area));
	}
}
