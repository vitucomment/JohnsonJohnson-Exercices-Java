import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08_SalarioComDesconto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Informe o salário: R$ ");
		double salario = input.nextDouble();
		System.out.println("");
		
		double salarioReajustado = salarioReajustado(salario);
		double descontoINSS = descontoINSS(salarioReajustado);
		double descontoFGTS = descontoFGTS(salarioReajustado);
		double descontosTotais = descontosTotais(descontoINSS, descontoFGTS);
		double salarioFinal = salarioFinal(salarioReajustado, descontosTotais);
		
		System.out.println("Salario Inicial: " + df.format(salario) + 
				"\nSalario Reajustado: " + df.format(salarioReajustado) + 
				"\nDesconto 11% INSS: " + df.format(descontoINSS) + 
				"\nDesconto 8% FGTS: " + df.format(descontoFGTS) + 
				"\nTotal Descontos INSS + FGTS: " + df.format(descontosTotais) + 
				"\nSalario Final: "+ df.format(salarioFinal));
		
		input.close();
	}

	public static double salarioReajustado(double salario) {
		double salarioReajustado = salario * 1.15;
		return salarioReajustado;
	}
	
	public static double descontoINSS(double salario) {
		double descontoINSS = salario * 0.11;
		return descontoINSS;
	}
	
	public static double descontoFGTS(double salario) {
		double descontoFGTS = salario * 0.08;
		return descontoFGTS;
	}
	
	public static double descontosTotais(double INSS, double FGTS) {
		double descontosTotais = INSS + FGTS;
		return descontosTotais;
	}
	
	public static double salarioFinal(double salarioReajustado, double descontosTotais) {
		double salarioFinal = salarioReajustado - descontosTotais;
		return salarioFinal;
	}
}
