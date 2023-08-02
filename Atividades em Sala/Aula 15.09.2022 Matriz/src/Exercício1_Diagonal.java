import java.util.Random;
public class Exercício1_Diagonal {

	public static void main(String[] args) {
	Random gerador = new Random();
	int[][] x = new int[4][4];
	int somaA = 0,somaB = 0;
	
	for(int i = 0; i <x.length; i++) {
		for(int j = 0; j < x[0].length; j++) {
			x[i][j] = gerador.nextInt(10);
				System.out.print(x[i][j] + "\t");
			}
		System.out.println();
		}
	
	for(int i = 0; i <x.length; i++) {
		for(int j = 0; j < x[0].length; j++) {
			if(i == j) {
				somaA += x[i][j];
			}else if(i + j ==x.length-1) {
				somaB += x[i][j];
			}
		}
	}
	System.out.println("Valor da primeira diagonal: " + somaA);
	System.out.println("Valor da segunda diagonal: " + somaB);
	}

}
