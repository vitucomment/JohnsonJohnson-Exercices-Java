import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17_PaesFranceses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite a quantidade de pães vendidos: ");
		int quantidadeDePaes = input.nextInt();
		System.out.print("Digite a quantidade de brovas vendidas: ");
		int quantidadeDeBroas = input.nextInt();
		System.out.print("Digite o valor da reforma: ");
		double valorReforma = input.nextDouble();
		System.out.println("");

		double faturamentoBroa = faturamentoBroa(quantidadeDeBroas);
		double faturamentoPaes = faturamentoPaes(quantidadeDePaes);
		double faturamento = faturamentoBroa + faturamentoPaes;
		double depositarPoupanca = depositarPoupanca(faturamento);
		double diasRestantes = diasRestantes(valorReforma, depositarPoupanca);

		System.out.println("Faturamento com a venda de broas: R$ " + df.format(faturamentoBroa));
		System.out.println("Faturamento com a venda de pães: R$ " + df.format(faturamentoPaes));
		System.out.println("Faturamento diario (pães + broas): R$ " + df.format(faturamento));
		System.out.println("Valor do deposito na poupança: R$ " + df.format(depositarPoupanca));
		System.out.println("Pra pagar a reforma serão necessários: " + diasRestantes + " dias");

		input.close();
	}

	public static double faturamentoBroa(int quantidade) {
		double faturamento = quantidade * 1.60;
		return faturamento;
	}

	public static double faturamentoPaes(int quantidade) {
		double faturamento = quantidade * 0.12;
		return faturamento;
	}

	public static double depositarPoupanca(double faturamento) {
		double depositarPoupanca = faturamento * 0.10;
		return depositarPoupanca;
	}

	public static double diasRestantes(double valorReforma, double valorDepositado) {
		double diasRestantes = Math.ceil(valorReforma / valorDepositado);
		return diasRestantes;
	}
}
