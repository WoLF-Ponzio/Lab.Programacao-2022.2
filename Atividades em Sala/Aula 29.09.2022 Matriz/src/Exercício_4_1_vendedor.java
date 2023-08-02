import java.util.Random;
import java.util.Scanner;

public class Exercício_4_1_vendedor {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Random gerador = new Random();
	String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun"};
	int TotalFuncionario;
	Double total;
	
	System.out.print("Informe a quantidade de funcionários: ");
	TotalFuncionario = teclado.nextInt();
	String[] funcionarios = new String[TotalFuncionario];
	double[][] vendas = new double[funcionarios.length][meses.length+1];

	//entrada do nome dos vendedores e geração das vendas
		teclado.nextLine();
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.print("Nome do vendedor #" + (i+1) + " ");
			funcionarios[i] = teclado.nextLine();
			
			//gerando os valores
			total = 0.0;
			for(int j = 0; j <meses.length; j++) {
					vendas[i][j] = gerador.nextInt(4);
					total += vendas[i][j];
				}
			vendas[i][meses.length] = total;

	}
	//Impressão da tabela de Vendas
		System.out.println("\nTabela de vendas");
		for(int i = 0; i < TotalFuncionario; i++) {
			for(int j = 0; j < meses.length; j++) {
				System.out.print(String.format("%.2f\t", vendas[i][j]));
			}
			System.out.println();
		}
		
	//a ---> impressão do total de vendas por vendedor
		System.out.println();
		System.out.println("Total de vendas por vendedor");
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i]+"\t" + "R$ " + String.format("%.2f", vendas[i][meses.length]));
		}
	}
}