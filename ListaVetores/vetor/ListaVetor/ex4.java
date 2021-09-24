import java.util.Scanner;
public class ex4 {
	public static void main(String args[]) {
		int v[]=new int [10];
		Scanner ler=new Scanner(System.in);	
		for(int i=0;i<10;i++) {
			v[i]=ler.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(v[i]%2==0) {
				for(i = 0;i<v[i];i+=2) {
					System.out.print("Os numeros pares são: "+i);
				}
			}
		}
	
	
	
	
	}
}

