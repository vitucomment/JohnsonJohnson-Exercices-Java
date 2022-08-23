import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16_LojaDeDecoracao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite o valor do faturamento do mês anterior: ");
		double faturamentoAnterior = input.nextDouble();
		System.out.println("");
		
		double metaDoProximoMes = metaDoProximoMes(faturamentoAnterior);
		double valorDoAumento = metaDoProximoMes - faturamentoAnterior;
		double produtoUm = produtoUm(valorDoAumento);
		double produtoDois = produtoDois(valorDoAumento);
		double produtoTres = produtoTres(valorDoAumento);
		
		System.out.println("A meta do proximo mês é: R$ " + df.format(metaDoProximoMes));
		System.out.println("Um aumento de: R$ " + df.format(valorDoAumento));
		System.out.println("Quantidade de peças a serem vendidas para atingirmos a meta: \n" +
		"\nProduto 1: " + df.format(produtoUm) + " peças" + 
		"\nProduto 2: " + df.format(produtoDois) + " peças" + 
		"\nProduto 3: " + df.format(produtoTres) + " peças");
		
		input.close();
	}

	public static double metaDoProximoMes(double faturamentoAnterior) {
		double meta = faturamentoAnterior * 1.20;
		return meta;
	}

	public static double produtoUm(double valorDoAumento) {
		double produtoUm = valorDoAumento / 150.0;
		return produtoUm;
	}

	public static double produtoDois(double valorDoAumento) {
		double produtoDois = valorDoAumento / 220.0;
		return produtoDois;
	}

	public static double produtoTres(double valorDoAumento) {
		double produtoTres = valorDoAumento / 97.0;
		return produtoTres;
	}

}
