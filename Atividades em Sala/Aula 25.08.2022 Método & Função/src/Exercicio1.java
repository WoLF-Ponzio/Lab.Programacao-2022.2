import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	boolean teste = false;

	do {
		System.out.print("Digite um n�mero inteiro e positivo: ");
		numero = teclado.nextInt();
		if(numero < 0) {
			System.out.println("Entrada inv�lida!!!");
		}else {
			teste = true;
		}
	}while(teste == false);
	print(numero);
	}



public static void print(int numero){
	if(numero == 0) {
		System.out.println("O " + numero + " n�o tem divisores");
	}else {
		
	
	for(int count = 1; count <= numero; count++) {
		if(numero%count == 0) {
			System.out.print(numero/count + " ,");
		}
	}
			System.out.println(" s�o divisores");
	}
}

}