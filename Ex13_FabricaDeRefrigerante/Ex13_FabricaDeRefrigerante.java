import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13_FabricaDeRefrigerante {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.print("Digite a quantidade de latas de 350ml: ");
		int latas = input.nextInt();
		
		System.out.print("Digite a quantidade de garrafas de 600ml: ");
		int G600 = input.nextInt();
		
		System.out.print("Digite a quantidade de garrafas de 2lts: ");
		int G2lts = input.nextInt();
		
		int somaLatas = somaLatas(latas);
		int somaG600 = somaG600(G600);
		int somaG2lts = somaG2lts(G2lts);
		double litrosTotal = litrosTotal(somaLatas, somaG600, somaG2lts);
		System.out.println("A quantidade total de litros é: " + df.format(litrosTotal));
		input.close();
	}
	
	public static int somaLatas(int latas) {
		int somaLatas = latas * 350;
		return somaLatas;
	}
	public static int somaG600(int G600) {
		int somaG600 = G600 * 600;
		return somaG600;
	}
	public static int somaG2lts(int G2lts) {
		int somaG2lts = G2lts * 2000;
		return somaG2lts;
	}
	public static double litrosTotal(int somaLatas, int somaG600, int somaG2lts) {
		double litrosEmMl = somaG2lts + somaG600 + somaLatas;
		double litrosTotal = litrosEmMl / 1000;
		return litrosTotal;
	}
}
