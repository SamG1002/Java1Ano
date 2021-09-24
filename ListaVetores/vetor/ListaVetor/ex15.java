import java.util.Scanner;
import java.util.Arrays;
public class ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [10],b[] = new int [10];
		for(int i=0;i<a.length;i++) {
			a[i] = ler.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Numeros em ordem crescente: [ -");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]+" - ");
			if(i == (a.length-1))System.out.println("]");
		}
		
		System.out.println();
		System.out.print("Numeros em ordem decrescente: [ -");
		for(int i=9;i>=0;i--) {
			b[i] = a[i];
			System.out.print(" "+b[i]+" - ");
			if(i == 0)System.out.println("]");
		}

		
	}
}
