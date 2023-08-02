import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			double a, b, c;
			double delta;
			double[] raizes = new double[2];
			
			System.out.println("Calculo da equação do segundo grau");
				System.out.print("Insira o valor de A: ");
				a = teclado.nextDouble();
				if(a == 0) {
					System.out.println("Não é uma equação do 2ºs grau");
				}else {
				System.out.print("Insira o valor de B: ");
				b = teclado.nextDouble();
				System.out.print("Insira o valor de C: ");
				c = teclado.nextDouble();
			
				delta = delta(a,b,c);
				if(delta < 0 ) {
					System.out.println("Raizes não pertencente aos reais");
				}else {
				raizes = raiz(delta,a,b);
				System.out.println(raizes[0]);
				System.out.println(raizes[1]);
				}
			}
		}
			public static double delta(double a, double b, double c) {
				double delta;
				
				delta = b*b - 4 * a * c;
				System.out.println("\nDelta = " + delta);
				return delta;
			}
			public static double[] raiz(double delta, double a, double b) {
				double[] raizes = new double[2];
				raizes[0] = (-b + Math.sqrt(delta))/a*2;
				raizes[1] = (-b - Math.sqrt(delta))/a*2;
				System.out.println("Os valores são:");
				return raizes;
			}
		}
