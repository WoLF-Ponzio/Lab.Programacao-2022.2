import java.util.Scanner;
public class Exercício_impressão_quebrada {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String palavra;
	
	System.out.print("Digite uma palavra: ");
	palavra = teclado.next();
	
	for(int i = 0; i < palavra.length(); i++) {
		System.out.println();
		for(int j = 0; j <= i; j++) {
			System.out.print(palavra.charAt(j));
		}
	}
	
	}

}
