import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double [] x = new double[7];
	String [] dias = {"Segunda-Feira" , "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};
	double media = 0;
	int count = 0;

	while(count != 1) {
		System.out.println("Calculadora de média de temperatura ");
		for(int i = 0; i < x.length; i++) {
			System.out.print("Digite a temperatura da(o) " + dias[i] + ": ");
			x[i] = teclado.nextDouble();
		}
		for(int i = 0; i < x.length; i++) {
			media = media + x[i];	
		}
		media = media/x.length;
		System.out.println();
		System.out.println("A média da semana foi " + String.format("%.2f", media) + "ºC");
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] > media) {
				System.out.println(dias[i]);
			}
		}
		System.out.println("Foram acima da média!");
		System.out.println();
		System.out.println("Deseja verficar mais temperaturas? 1 para sim e 0 para não");
		count = teclado.nextInt();
		if(count == 1) {
			System.out.println("Operação terminada");
		}
	}
	

	}

}
