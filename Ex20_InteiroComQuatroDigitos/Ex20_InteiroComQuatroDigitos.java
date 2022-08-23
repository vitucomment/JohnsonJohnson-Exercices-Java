import java.util.Scanner;

public class Ex20_InteiroComQuatroDigitos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um numero de 4 digitos: ");
		int numeroInteiro = input.nextInt();
		System.out.println("");

		int milhar = numeroInteiro / 1000;
		int centena = Math.abs(((milhar * 1000) - numeroInteiro) / 100);
		int dezena = Math.abs(((milhar * 1000) + (centena * 100) - (numeroInteiro)) / 10);
		int unidade = Math.abs(((milhar * 1000) + (centena * 100) + (dezena * 10) - (numeroInteiro)));

		System.out.println("Milahres: " + milhar);
		System.out.println("Centenas: " + centena);
		System.out.println("Dezenas: " + dezena);
		System.out.println("Unidades " + unidade);

		input.close();
	}
}
