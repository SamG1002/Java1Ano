package Avaliativa;
import java.util.*;
class func1 {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println("escreva a quantidade de meses");
		int a= in.nextInt();
		System.out.println("escreva o valor do investimento");
		double  b=in.nextDouble();
		System.out.print("R$ ");
		System.out.printf("%.2f",  invest(a, b));
	}
	public static double invest (int qtdMeses, double investimento) {
		for (int i=1;i<=qtdMeses;i++) 	investimento*=1.01;
		return investimento;
	}
}
