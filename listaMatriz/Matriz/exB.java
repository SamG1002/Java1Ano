import java.util.Scanner;
import java.lang.Math;
public class exB {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		int matriz[][]= new int [3][3];
		int m=0,n=0,a=0,b=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j] = (int) (Math.random()*10);
				if(matriz[i][j] > matriz[m][n]) {
					m=i;
					n=j;
				}
				else if(matriz[i][j] < matriz[a][b]) {
					a=i;
					b=j;
				}
				//System.out.println("O maior é "+matriz[m][n]+" ,Ja o menor é "+matriz[a][b]);
			}
		}
	}

}
