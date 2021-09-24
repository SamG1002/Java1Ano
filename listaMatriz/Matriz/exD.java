import java.util.Scanner;
import java.lang.Math;
public class exD {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		int r=0,vitorias=0;
		int m[][] = new int [3][3];
		boolean teste = false;
		//cria a tabela do bingo
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j] =(int) (Math.random()*75);
			}
		}
		while(vitorias < 17) {
			System.out.println("Escreva um numero");
			r = ler.nextInt();
			for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(r == m[i][j]) {					
					vitorias++;
					teste = true;
					}
				}
			}
			if(teste ==true ) {
				System.out.println("Acertou");
				teste = false;
			}else {
				System.out.println("Errou");
			}
			
		}
		System.out.println("Bingo");
	}

}
