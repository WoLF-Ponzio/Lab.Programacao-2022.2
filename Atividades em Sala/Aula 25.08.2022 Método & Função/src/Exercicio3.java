import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[] numero = new int[3];
	int teste;
	
	System.out.println("Insira 3 número positivos");
	for(int i = 0; i < numero.length; i++) {
		System.out.print(i+1 + "º número: ");
		numero[i] = teclado.nextInt();
	}
	teste = print(numero);
	System.out.println(teste +" é o maior valor");
	}

public static int print(int[] numero) {
	int teste = 0;
	for(int i = 0; i < numero.length; i++) {
		if(i == 0) {
			teste = numero[i];
		}else if (teste < numero[i]) {
			teste = numero[i];
		}
	}
	return teste;
}

}
