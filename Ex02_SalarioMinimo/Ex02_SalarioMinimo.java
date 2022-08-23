import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02_SalarioMinimo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor do salario minimo: ");
		double salarioMinimo = input.nextDouble();
		System.out.print("Informe o valor do salario do funcionario: ");
		double salarioFuncionario = input.nextDouble();
		System.out.println("");

		calculaProporcao(salarioMinimo, salarioFuncionario);

		input.close();
	}

	public static void calculaProporcao(double valor1, double valor2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double proporcao = (valor2 / valor1);
		System.out.println("O funcionario recebe " + df.format(proporcao) + " salarios minimos!");
	}

}
