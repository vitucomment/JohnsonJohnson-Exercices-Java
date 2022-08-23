import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05_DivisaoAB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Informe o primeiro valor: ");
		int primeiroNumero = input.nextInt();
		System.out.print("Informe o segundo valor: ");
		int segundoNumero = input.nextInt();
		
		double primeiroDouble = primeiroNumero;
		double resultado = primeiroDouble/segundoNumero;
		
		System.out.println("A divisão de " + primeiroNumero + " por " + segundoNumero + " é: " + df.format(resultado));
		
		input.close();
	}
}
