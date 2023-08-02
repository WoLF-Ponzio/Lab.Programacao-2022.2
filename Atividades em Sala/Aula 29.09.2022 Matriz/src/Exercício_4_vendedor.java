import java.util.Random;
import java.util.Scanner;

public class Exercício_4_vendedor {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Random gerador = new Random();
	String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun"};
	int TotalFuncionario;
	
	
	System.out.print("Informe a quantidade de funcionários: ");
	TotalFuncionario = teclado.nextInt();
	String[] funcionarios = new String[TotalFuncionario];
	double[][] vendas = new double[funcionarios.length][meses.length+1];
	nomes(funcionarios);
	GeradorDeVendas(vendas, meses);
	Ex_A(funcionarios,vendas,meses);
	Ex_B(funcionarios,vendas,meses);
	Ex_C(funcionarios,vendas,meses);
	

	}
    //Colocando os nomes
	public static String[] nomes(String[] funcionarios) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
			funcionarios[i] = teclado.nextLine();
		}
		return funcionarios;
	}
	//Gerando e imprimindo as vendas
	public static double[][] GeradorDeVendas(double[][] vendas, String[] meses) {
		double total = 0;
		Random gerador = new Random();
		for(int i = 0; i < vendas.length; i++) {
			total = 0;
			
			for(int j = 0; j < meses.length; j++) {
				vendas[i][j] = gerador.nextInt(30);
				total += vendas[i][j];
				
				System.out.print("|" + vendas[i][j] + "|" + "\t");
			}
			vendas[i][meses.length] = total;
			System.out.println();
		}
		System.out.println();		
		return vendas;
	}
	
	//Exercício A
	public static void Ex_A(String[]funcionarios, double[][] vendas, String[] meses){
		System.out.println("Total de vendas por vendedor");
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.println(String.format("20.%s", funcionarios[i])+"\t" + "R$ " + String.format("%.2f", vendas[i][meses.length]));
		}
		System.out.println();
	}
	//Exercicio B
	public static void Ex_B(String[]funcionarios, double[][] vendas, String[] meses) {
		double[] totalMes = new double[meses.length];
		System.out.println("Total de vendas por mês");
		for(int j = 0; j < meses.length; j++) {
			System.out.print(String.format("%.20s", meses[j] + "\t"));
			for(int i = 0; i < vendas.length; i++ ) {
				totalMes[j] += vendas[i][j];
			}
			System.out.println(" R$ " + totalMes[j]);
		}
		System.out.println();
	}
	
	//Exercicio C e D
	public static void Ex_C(String[]funcionarios, double[][] vendas, String[] meses) {
		double[] totalFunc = new double[meses.length];
		double maior = 0, menor = 0;
		int aux2 = 0;
		int aux = 0;
		
		for(int i = 0; i < funcionarios.length; i++) {
			for(int ii = 0; i < totalFunc.length; i++) {
			if(totalFunc[ii] > maior) {
				maior = totalFunc[ii];
				aux = ii;
			}
			if(i == 0) {
				menor = totalFunc[i];
				aux2 = i;
			}else if(totalFunc[i] < menor) {
				menor = totalFunc[i];
				aux2 = i;
			}
			for(int j = 0; j < meses.length; j++) {
				totalFunc[j] = vendas[i][j];
			}
		}
		
			
		}
		System.out.println("O funcionário com a maior venda foi o(a) " + funcionarios[aux]  + ", com R$ " + maior);
		System.out.println("O funcionário com a menor venda foi o(a) " + funcionarios[aux2] + ", com R$ " + menor);
	}
}