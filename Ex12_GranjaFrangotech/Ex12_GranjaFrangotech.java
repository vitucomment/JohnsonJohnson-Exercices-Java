import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12_GranjaFrangotech {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite a quantidade de frangos: ");
		int quantidadeDeFrangos = input.nextInt();

		double valorTotal = valorTotal(quantidadeDeFrangos);

		System.out.println("O valor total para identificar os frangos é: R$" + df.format(valorTotal));
		
		input.close();
	}

	public static double valorTotal(int quantidadeDeFrangos) {
		double valorTotal = quantidadeDeFrangos * 11;
		return valorTotal;
	}
}
