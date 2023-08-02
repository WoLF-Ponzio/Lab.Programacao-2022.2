import java.util.Scanner;
import java.util.Random;
public class Exercício_6_Multiplicação_De_Matrizes {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int linhaA, colunaA;
	int linhaB, colunaB; 
		
	System.out.println("Insira o tamanho das matrizes");
	System.out.print("Insira o tamanho da linha da Matriz A: ");
	linhaA = teclado.nextInt();
	System.out.print("Insira o tamanho da coluna da Matriz A: ");
	colunaA = teclado.nextInt();
	linhaB = colunaA;
	System.out.print("Insira o tamanho da linha da Matriz B: ");
	colunaB = teclado.nextInt();
	
	int[][] MatrizA = new int[linhaA][colunaA];
	int[][] MatrizB = new int[linhaB][colunaB];
	int[][] MatrizC = new int[linhaA][colunaB];
	
	MatrizA = Gerador(MatrizA);
	MatrizB = Gerador(MatrizB);
	
	System.out.println("\nMatriz A");
	imprimir(MatrizA);
	System.out.println("\nMatriz B");
	imprimir(MatrizB);
	MatrizC = Multiplicação(MatrizA, MatrizB, MatrizC);
	System.out.println("\n Resultado Da Multiplicação \n Matriz C");
	imprimir(MatrizC);
	}
	
	
			
			
	public static int[][] Gerador(int[][]MatrizM){
		Random gerador = new Random();
		for(int i = 0; i < MatrizM.length; i++) {
			for(int j = 0; j < MatrizM[i].length; j++) {
			MatrizM[i][j] = gerador.nextInt(5);
			}
		}
		return MatrizM;
	}
	
	public static void imprimir(int[][]MatrizM) {
			for(int i = 0; i < MatrizM.length; i++) {
				for(int j = 0; j < MatrizM[i].length; j++) {
				System.out.print("|" + MatrizM[i][j] + "|\t");
				}
				System.out.println();
			}
	}

	public static int[][] Multiplicação(int[][]MatrizA,int[][]MatrizB,int[][]MatrizC){
		int soma;
		for(int i = 0; i < MatrizA.length; i++) { //Controla as linhas da Matriz A
			for(int k = 0; k < MatrizB[0].length; k++) { //Controla as colunas da Matriz B
				soma = 0;
				for(int j = 0; j < MatrizA[i].length; j++) { // Controla as colunas de A e linhas de B
					soma += MatrizA[i][j]*MatrizB[j][k];
				}
				MatrizC[i][k] = soma;
			}
				
		}
		return MatrizC;
	}
}
