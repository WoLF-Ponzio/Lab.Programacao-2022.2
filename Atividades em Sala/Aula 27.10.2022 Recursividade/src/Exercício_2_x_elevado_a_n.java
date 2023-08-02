import java.util.Scanner;
public class Exercício_2_x_elevado_a_n {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double x, n;
	
	System.out.print("Digite o valor de X: ");
	x = teclado.nextDouble();
	System.out.print("Digite quantas vezes você deseja elevar o número: ");
	n = teclado.nextDouble();
	System.out.println(x + "^" + n + " = " + elevar(x,n));
	
	}
	
	public static double elevar(double x, double n) {
		if(n == 0) { 
			return 1;
		}else if (n == 1) {
			return x;
		}
		return x * elevar(x,n - 1);
	}

}
