import java.util.Scanner;
public class Exemplo1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int [][] x = new int [3][3];
	
	for(int i = 0; i < x.length; i++) {
		for(int j = 0; j < x.length; j++) {
			System.out.print("coloca o valor [" + (i+1) + "] [" + (j+1) + "] fdp: ");
			x[i][j] = teclado.nextInt();
		}
	}
	for(int i = 0; i < x.length; i++) {
		for(int j = 0; j < x[i].length; j++) {
		System.out.print("|"+x[i][j]+ "|" + "\t");
		}
		System.out.println();
	}
	}

}
