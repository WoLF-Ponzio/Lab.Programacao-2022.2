import java.util.Scanner;
public class Exercício1_jogo_da_velha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[][] velha = new char[3][3];
		int a,l, testeValor;
		boolean teste = false;
		
		System.out.println("Jogo da Velha");
		System.out.println("O primeiro jogador será 'X' e o segundo será O ");
		impressao(velha);
		
		for(int i = 1; i <= 9;) {
			do {
				do {	
				if((i % 2) == 1) {
					System.out.println("\nJogador X");
				}else {
					System.out.println("\nJogador O");
				}
				
				System.out.print("Escolha o local da linha (1 a 3): ");
				a = (teclado.nextInt()-1);
				System.out.print("Escolha o local da coluna (1 a 3): ");
				l = (teclado.nextInt()-1);
				if(a>3||a>3 && l>3 || l>3 || a<0||a<0 && l<0||l<0) {
					System.out.println("Coordenadas Inválidas");
				}
				}while(a>3||a>3 && l>3 || l>3 || a<0||a<0 && l<0||l<0 );
				
					if(velha[l][a] != 0 ) {
					System.out.println("A casa já está ocupada");}
				}while(velha[l][a] !=0 );
				
				if((i % 2) == 1) {
						velha[l][a] = 'X';
					}else {
						velha[l][a] = 'O';
					}
			System.out.println("");
			impressao(velha);
			teste = vencedor(velha, teste);
			if(teste != true) {
				i++;
			}else {
				
			}
		
			}
		System.out.println("Empate!");
		}
	
	
	
	public static void impressao(char[][] velha) {
		
		for(int i = 0; i < velha.length; i++) {
			for(int j = 0; j < velha[i].length; j++) {
				if(velha[i][j] == 0) {
					System.out.print("|" + " " + "|" + "\t");
				}else {
					System.out.print("|" + velha[i][j]+ "|" + "\t");
				}
		
				}
					System.out.println();
			}
	}
	public static boolean vencedor(char[][] velha, boolean teste) {
		int somaL = 0, somaC2 = 0, somaC3 =0, somaC = 0, somaD = 0, somaD2 = 0;
		for(int i = 0; i <velha.length; i++) {
			somaL = 0;
			for(int j = 0; j < velha[0].length; j++) {
				if(i == j) {
					somaD += velha[i][j];
				}
				if(i + j == velha.length-1) {
					somaD2 += velha[i][j];
				}
				if(j == 0){
					somaC += velha[i][j];
				}
				if (j == 1) {
					somaC2 += velha[i][j];
				}
				if (j == 2) {
					somaC3 = velha[i][j];
				}
					somaL += velha[i][j];
					
			if(somaL == 264 || somaC == 264 || somaC2 == 264|| somaC3 == 264|| somaD == 264|| somaD2 == 264) {
				System.out.println("Velha!!!");
				System.out.println("O jogado X venceu!");
				teste = true;
				return teste;
			}else if (somaL == 237 || somaC == 237 || somaC2 == 237|| somaC3 == 237|| somaD == 237|| somaD2 == 237) {
				System.out.println("Velha!!!");
				System.out.println("O jogado Y venceu!");
				teste = true;
				return teste;	
			}
		}
	
		}
		teste = false;
		return teste;
	}
}
