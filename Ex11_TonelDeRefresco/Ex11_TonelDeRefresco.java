import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11_TonelDeRefresco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite a QTDE de lts de suco necessária: ");
		int quantidadeDeSuco = input.nextInt();

		System.out.println("\nSera necessario para fazer " + quantidadeDeSuco + " lts de suco de maracuja");
		System.out.println(df.format(litrosDeAgua(quantidadeDeSuco)) + " lts de agua");
		System.out.println(df.format(litrosConcentrado(quantidadeDeSuco)) + " lts de suco concentrado de maracuja");
		input.close();
	}

	public static double litrosDeAgua(int quantidadeDeSuco) {
		double litrosDeAgua = quantidadeDeSuco * 0.8;
		return litrosDeAgua;
	}

	public static double litrosConcentrado(int quantidadeDeSuco) {
		double litrosConcentrado = quantidadeDeSuco * 0.2;
		return litrosConcentrado;
	}
}
