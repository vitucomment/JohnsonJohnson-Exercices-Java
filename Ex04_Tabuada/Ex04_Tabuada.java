import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04_Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Informe o numero para o calculo da tabuada: ");
		int numero = input.nextInt();

		System.out.println("Tabuada do + e - para o numero " + numero);
		for (int i = 0; i < 10; i++) {
			int resultadoAdicao = (numero + i);
			System.out.print(numero + " + " + i + " = " + resultadoAdicao + "\t");
			int resultadoSubtracao = Math.abs(numero - i);
			System.out.println(numero + " - " + i + " = " + resultadoSubtracao);
		}

		System.out.println("");

		System.out.println("Tabuada do * e / para o numero " + numero);
		for (int i = 0; i < 10; i++) {
			int resultadoMultiplicacao = (numero * i);
			System.out.print(numero + " * " + i + " = " + resultadoMultiplicacao + "\t");

			if (i != 0) {
				double valor = i;
				double resultadoDivisao = (numero / valor);
				System.out.println(numero + " / " + i + " = " + df.format(resultadoDivisao));
			} else {
				System.out.println(numero + " / " + i + " = não existe divisão por zero");
			}
		}
		input.close();
	}
}
