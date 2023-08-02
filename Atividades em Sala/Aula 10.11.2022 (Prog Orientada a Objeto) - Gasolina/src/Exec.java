import java.util.Scanner;
public class Exec {
	
	Registro[] registro = new Registro[5];
	
	public void inserir() {
		Scanner teclado = new Scanner(System.in);
		String[]gasolina = {"álcool", "gasolína","diesel"};
		int aux;
		
		for(int i = 0; i < registro.length; i++) {
			registro[i] = new Registro();
			System.out.print("Digite o nome do proprietário do veículo: ");
			registro[i].nome = teclado.nextLine();
			System.out.println("Para o combustível do carro, digite 1, 2 ou 3, para respectivos, álcool, gasolina ou diesel");
				do {
					aux = teclado.nextInt();
					if(aux < 1 || aux > 3) {
						System.out.println("Entrada inválida");
					}else {
						registro[i].combustivel = gasolina[(aux-1)];
					}
				}while (aux < 1 || aux > 3);
			System.out.println("Digite a placa do carro (no formato lllnnnn)");
			registro[i].placa = teclado.next();
		}
	}

}
