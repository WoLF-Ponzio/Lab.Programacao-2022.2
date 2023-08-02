import java.util.Random;
import java.util.Scanner;

public class Exec {
	
	Produto[] produto = new Produto[5];
	
	public void inserir() {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < produto.length; i++) {
			produto[i] = new Produto();
			produto[i].codigo = gerador.nextInt(1000,9999);
			System.out.print("Insira o nome do produto: ");
			produto[i].nome = teclado.nextLine();
			System.out.print("Insira o preço do produto: ");
			produto[i].preco = teclado.nextDouble();
			for(int j = 0; j < produto[i].baixaSemana.length; j++) {
				produto[i].baixaSemana[j] = gerador.nextInt(0,100);
			}
			teclado.nextLine();
		}
	}
	
	public void imprimir() {
		int[] aux = new int[5];
		int comparativo = 0;
		for(int i = 0; i < produto.length; i++) {
			for(int j = 0; j < produto[i].baixaSemana.length; j++) {
				aux[i] += produto[i].baixaSemana[j];
			}
			if(i == 0) {
				comparativo = i;
			}else if(aux[i] > comparativo) {
				comparativo = i;
			}
		}
		
		System.out.println("O produto que mais vendeu foi: " + produto[comparativo].nome + "nº " + produto[comparativo].codigo);
		System.out.println("Total de Vendas: " + aux[comparativo]);
		System.out.println("Ele gerou um total de R$ " + String.format("%.2f",  aux[comparativo] * produto[comparativo].preco));
		
	}
}
