import java.util.Scanner;
public class Exerc�cio_6_n�smio_fibonacci {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	float posicao;
	
	System.out.print("Digite a posi��o: ");
	posicao = teclado.nextInt();
	System.out.println(calcular(posicao));
		
	}

	private static int calcular(float i) {
	if(i == 1 || i == 2) return 1;
	return calcular(i - 1) + calcular(i - 2);
	
	}

}
