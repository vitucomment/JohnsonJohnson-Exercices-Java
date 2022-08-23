import java.util.Scanner;

public class Ex19_QuantosAnosPassaram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = input.nextInt();
		System.out.print("Digite o mes: ");
		int mes = input.nextInt();
		int diasPassados = 0;

		if (mes == 1) {
			diasPassados = dia;
		} else if (mes == 12) {
			diasPassados = (mes - 1) * 30 + dia;
		} else {
			diasPassados = mes * 30 + dia;
		}
		System.out.println("A quantidade de dias que se passaram foi: " + diasPassados + " dias");
		
		input.close();
	}
}
