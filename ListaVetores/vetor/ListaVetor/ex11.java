import java.util.Scanner;
public class exe11 {
	public static void main(String args[]) {
	int	v[]=new int [10],busca;
	Scanner ler=new Scanner (System.in);
	System.out.println("Digite o número de busca");
	busca=ler.nextInt();
	for(int i=0; i<10;i++) {
		v[i]=ler.nextInt();
	}
	for(int i=0;i<10;i++) {
		if(busca==v[i]) {
			System.out.println("o numero esta no indice "+i);
		}
	}
	}
}
