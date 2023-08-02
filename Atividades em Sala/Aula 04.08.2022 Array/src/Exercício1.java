import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[]n = new int[5];
	int ma=0, me=0;
	
	for(int i = 0; i<n.length; i++){
		System.out.print("Insira o " + i + " número: ");
		n[i] = teclado.nextInt();
		
		if(n[i] > ma) {
			ma = n[i];
		}else if(n[i] < me) {
			me = n[i];
		}
		System.out.println();
	}
	System.out.println("O maior númeor foi " + ma + " e o menor foi " + me);
	
	}

}
