package Avaliativa;
import java.util.*;
public class func2 {
	public static int op=0;
	public static Scanner in = new Scanner (System.in);
	public static void main(String[] args) { 
		System.out.println("Qual o Valor Gasto ?");
		double gasto = in.nextDouble();
		op = opcoes(gasto);
		if(op == 1 ) {
			opcao1(gasto);
		}
		if(op == 2 ) {
			opcao2(gasto);
		}
		if(op == 3 ) {
			opcao3(gasto);
		}
	}
public static int opcoes (double gasto) {
	if(gasto > 100) {
	System.out.println("A vista com 10% de desconto ? aperte 1");
	System.out.println("Em 2x ? aperte 2");
	System.out.println("De 3 ate 10x com 3% de juros ao mês ? aperte 3");
	op = in.nextInt();
	}else {
		System.out.println("A vista com 10% de desconto ? aperte 1");
		System.out.println("Em 2x ? aperte 2");
		op = in.nextInt();
	}
	return op;
	}
	public static void opcao1 (double gasto) {
		double r = gasto * 0.9;
		System.out.println("O valor a ser Pago eh "+r);
	}
	public static void opcao2 (double gasto) {
		double r = gasto / 2;
		System.out.println("Voce pagara em 2x de "+r+" que resultara no valor da etiqueta "+gasto);
	}
	public static void opcao3 (double gasto) {
		System.out.println("Voce quer pagar em Quantas Parcelas ?");
		int p = in.nextInt();
		double r = gasto  / p + ((gasto / p) * (0.01 * 3));
		System.out.print("Voce pagara por "+ p +" meses R$");
		System.out.printf("%.2f",r);
		System.out.println(" por mes");	
}
}
