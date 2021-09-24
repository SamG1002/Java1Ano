import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [11],pot = 1;
		for(int i = 0; i < a.length;i++ ) {
			a[i] = pot;
			System.out.println("2 elevado a "+i+" = "+pot);
			pot*=2;
		}
		
	}
}
