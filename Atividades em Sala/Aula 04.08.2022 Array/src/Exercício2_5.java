import java.util.Scanner;
public class Exerc�cio2_5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[]x = new int[5];
	int par = 0,impar;
	
	for(int i = 0; i<x.length; i++) {
		System.out.print("Digite um valor: ");
	x[i] = teclado.nextInt();
	if(x[i] % 2 == 0) {
		par++;
		}
	}
	impar = x.length - par;
	System.out.println(par + " n�meros foram pares e " + impar + " n�meros foram �mpares");

	}
}
