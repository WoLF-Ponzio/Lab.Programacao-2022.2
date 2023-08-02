import java.util.Scanner;
import java.util.Random;
public class Exercício6_2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[] numero = new int[10];
	
	System.out.println("Gerando 10 números aleatórios");
	gerador(numero);
	impressor(numero);
	numero = ordenador(numero);
	System.out.println("\nNa ordem crescente:");
	impressor(numero);
		}
	
public static int[] gerador(int[]numero) {
	Random gerador = new Random();
	for(int i = 0; i < numero.length;i++) {
		numero[i] = gerador.nextInt(100);
	}
	return numero;
}

public static void impressor(int[]numero) {
	for(int i = 0; i < numero.length;i++) {
		System.out.print(numero[i] + ", ");
	}
}

public static int[] ordenador(int[]numero) {
	int aux = 0;

//Na hora de ordenar os números, temos que fazer uma comparação
//que compare de 2 em 2, jogando para frente o número mais alto.
//Através disso, o maior vai e o menor fica
	
			for(int a = 0; a< numero.length;a++) {
				for(int b = 0; b < numero.length;b++) {
					if(numero[a] < numero[b]) {
						aux = numero[a];
						numero[a] = numero[b];
						numero[b] = aux;
					}
				}
			}
		
	return numero;
}
}