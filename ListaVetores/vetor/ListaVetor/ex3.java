import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[]=new int [11],cont=0;
		for(int i=0,j=1;i<a.length;i++,j++) {
			a[i] = ler.nextInt(); 
		}
		for(int i=0,j=1;i<a.length;i++,j++) {
			cont = 0;
		
			for(int div=1;div<=a.length;div++) {
				if(a[i] % div == 0)cont++; 
			}
			if(cont == 2) {
				System.out.println(a[i]+" eh primo");
			}else {
				System.out.println(a[i]+" nao eh primo");
			}
		}
	}
}
