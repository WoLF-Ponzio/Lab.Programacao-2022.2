import java.util.Scanner;
public class Exemplo_fatoria_com_recursividade {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print(fatorial(170));
	
	}
	
	public static double fatorial(int valor) {
		if(valor == 1) return 1;
		
		return valor * fatorial(valor - 1);
	}

}
