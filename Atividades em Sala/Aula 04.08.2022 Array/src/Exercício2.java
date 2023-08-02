import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[]x = new int[1000];
	int impar = 0, par = 0;
	
	for(int i = 0; i<x.length; i++) {
		System.out.print("Digite um valor: ");
	x[i] = teclado.nextInt();
	if(x[i] % 2 == 0) {
		par++;
	}else
		impar++;
	}
	System.out.println(par + " números foram pares e " + impar + " números foram ímpares");

	}

}
