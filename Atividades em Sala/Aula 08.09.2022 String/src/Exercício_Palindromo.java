import java.util.Scanner;
public class Exerc�cio_Palindromo {

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
			System.out.println("Essa palavra � um pal�ndromo");
		}else {
			System.out.println("Essa palavra n�o � um pal�ndromo");
		}
	}

}
