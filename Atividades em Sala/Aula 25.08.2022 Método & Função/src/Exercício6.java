import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Exercício6 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Random gerador = new Random();
	int[] numero = new int[5];
	
	System.out.println("Gerando 10 números aleatórios");
	for(int i = 0; i < numero.length;i++) {
		numero[i] = gerador.nextInt(10);
	System.out.print(numero[i] + ", ");
	}
		numero = ordenador(numero);
		System.out.println("\nNa ordem crescente:");
		for(int i = 0; i < numero.length;i++) {
			System.out.print(numero[i] + ", ");
		}
	}
public static int[] ordenador(int[]numero) {
	Arrays.sort(numero);
	return numero;
}
}
