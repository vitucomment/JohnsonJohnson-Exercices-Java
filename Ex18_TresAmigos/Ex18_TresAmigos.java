import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18_TresAmigos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Informe o valor da conta R$: ");
		double valorDaConta = input.nextDouble();
		System.out.println("");

		double valorCarlos = Math.floor(valorDaConta * 0.33);
		double valorAndre = Math.floor(valorDaConta * 0.33);
		double valorFelipe = valorDaConta - valorCarlos - valorAndre;

		System.out.println("Carlos pagará: R$ " + df.format(valorCarlos));
		System.out.println("Andre pagará: R$" + df.format(valorAndre));
		System.out.println("Felipe pagará: R$ " + df.format(valorFelipe));
		
		input.close();
	}
}
