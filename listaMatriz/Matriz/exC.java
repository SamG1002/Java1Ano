import java.util.Scanner;
import java.lang.Math;
public class exC {
	public static void main(String[]args){
	Scanner ler = new Scanner (System.in);
	int m [][] = new int[3][4];
	int soma=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			//m [i][j] = ler.nextInt();;
			m [i][j] = (int) (Math.random()*10);
			soma = soma + m[i][j];
			if(j == (m.length-1)) {
			m[i][3] = soma;
			System.out.println(m[i][3]);
			soma = 0;
			}
		}
	}

   }
}