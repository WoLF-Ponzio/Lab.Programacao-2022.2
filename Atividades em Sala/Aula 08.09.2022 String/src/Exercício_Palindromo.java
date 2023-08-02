import java.util.Scanner;
public class Exercício_Palindromo {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String palavra, aux = "";
	
	System.out.print("Digite uma palavra: ");
	palavra = teclado.next();
	palavra = palavra.toLowerCase();
	
	for(int i = (palavra.length()-1); i >= 0; i--) {
		aux += palavra.charAt(i);
	}
		if(aux.equals(palavra)) {
			System.out.println("Essa palavra é um palíndromo");
		}else {
			System.out.println("Essa palavra não é um palíndromo");
		}
	}

}
