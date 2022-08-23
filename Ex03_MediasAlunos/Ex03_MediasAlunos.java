import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03_MediasAlunos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		double nota1 = input.nextDouble();
		System.out.print("Informe a nota 2: ");
		double nota2 = input.nextDouble();
		System.out.print("Informe a nota 3: ");
		double nota3 = input.nextDouble();
		System.out.println("");

		mediaPonderada(nota1, nota2, nota3);

		
		input.close();
	}

	public static void mediaPonderada(double nota1, double nota2, double nota3) {
		DecimalFormat df = new DecimalFormat("0.00");
		double mediaPonderada = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / 6;
		System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + ", " + nota3 + " é: "
				+ df.format(mediaPonderada));	}
}
