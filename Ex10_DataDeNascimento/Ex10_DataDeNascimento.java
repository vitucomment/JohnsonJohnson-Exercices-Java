import java.util.Scanner;

public class Ex10_DataDeNascimento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o ano inicial: ");
		int anoInicial = input.nextInt();

		System.out.print("Digite o ano final: ");
		int anoFinal = input.nextInt();
		System.out.println("");

		int idadeEmAnos = idadeEmAnos(anoInicial, anoFinal);

		System.out.println(
				"A idade desta pessoa em \n" + "Anos é: " + idadeEmAnos + "\nMeses é: " + idadeEmMeses(idadeEmAnos)
						+ "\nDias é: " + idadeEmDias(idadeEmAnos) + "\nSemanas é: " + idadeEmSemanas(idadeEmAnos));
		input.close();
	}

	public static int idadeEmAnos(int anoInicial, int anoFinal) {
		int idadeEmAnos = anoFinal - anoInicial;
		return idadeEmAnos;
	}

	public static int idadeEmMeses(int idadeEmAnos) {
		int idadeEmMeses = idadeEmAnos * 12;
		return idadeEmMeses;
	}

	public static int idadeEmDias(int idadeEmAnos) {
		int idadeEmDias = idadeEmAnos * 365;
		return idadeEmDias;
	}

	public static int idadeEmSemanas(int idadeEmAnos) {
		int idadeEmSemanas = idadeEmAnos * 52;
		return idadeEmSemanas;
	}
}
