import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15_Hipotheticus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite a quantidade total de horas normais: ");
		int horasNormais = input.nextInt();
		System.out.print("Digite a quantiade total de horas extras: ");
		int horasExtras = input.nextInt();
		System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
		int dependentes = input.nextInt();
		System.out.println("");

		double calculaHorasNormais = calculaHorasNormais(horasNormais);
		double calculaHoraExtra = calculaHoraExtra(horasExtras);
		double calculaDependentes = calculaDependentes(dependentes);
		double salarioLiquido = calculaHorasNormais - desconto(calculaHorasNormais);
		double salarioFinal = salarioFinal(salarioLiquido, calculaHoraExtra, calculaDependentes);

		System.out.println("Horas normais: R$ " + df.format(calculaHorasNormais));
		System.out.println("Adicional de Horas Extras: R$ " + df.format(calculaHoraExtra));
		System.out.println("Adicional de Dependentes: R$ " + df.format(calculaDependentes));
		System.out.println("Salario Liquido (Hrs normais - Desconto): R$ " + df.format(salarioLiquido));
		System.out.println("Salario final: R$ " + df.format(salarioFinal));

		input.close();
	}

	public static double calculaHorasNormais(int horasNormais) {
		double calculaHorasNormais = horasNormais * 10.0;
		return calculaHorasNormais;
	}

	public static double calculaHoraExtra(int horasExtras) {
		double calculaHorasExtras = horasExtras * 15.0;
		return calculaHorasExtras;
	}

	public static double calculaDependentes(int dependentes) {
		double calculaDependentes = dependentes * 90.0;
		return calculaDependentes;
	}

	public static double desconto(double horasNormais) {
		double desconto = horasNormais * 0.11;
		return desconto;
	}

	public static double salarioFinal(double salarioLiquido, double horasExtras, double dependentes) {
		double salarioFinal = salarioLiquido + horasExtras + dependentes;
		return salarioFinal;
	}
}
