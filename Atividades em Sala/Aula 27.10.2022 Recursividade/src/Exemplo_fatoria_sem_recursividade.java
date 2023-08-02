import java.util.Scanner;
public class Exemplo_fatoria_sem_recursividade {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print(fatorial(170));
	
	}
	
	public static double fatorial(int valor) {
		double fat = 1;
				for(int contador = valor; contador > 0; contador --) {
					fat = fat * contador;
					
				}
			return fat;
	}

}
