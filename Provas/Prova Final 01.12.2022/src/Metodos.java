import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Scanner;

public class Metodos {

	Cliente[] cliente = new Cliente[5];
	
	public void inicializador() {
		
		for(int i = 0; i < cliente.length; i++) {
			cliente[i] = new Cliente();
		}
	}
	
	public void Menu() {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		inicializador();
		for(int m = 0; m < 1;) {
			System.out.println("Menu");
			System.out.println("1 - Cadastro do Cliente \n2 - Listagem de Clientes \n3 - Cliente da Semana \n4 - Saldo da Semana \n5 - Finalizar");
			System.out.print("Digite a operação desejada: ");
			opcao = teclado.nextInt();
			System.out.println();
					
					if (opcao < 1 || opcao > 5) {
						System.out.println("Opção inválida");
					} else {
						
						}switch (opcao) {

						case 1:
							Cadastrar();
							break;
						case 2:
							Listar();
							break;
						case 3:
							MelhorCompra();
							break;
						case 4:
							Saldo();
							break;
						case 5:
							System.out.println("Operação termiinada com sucesso! ");
							m = 1;
							break;
						}
				}
	}
	
	public void Cadastrar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Lista: ");
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].Nome.equals("")) {
				System.out.print("Digite o nome do cliente: ");
				cliente[i].Nome = teclado.nextLine();
				System.out.print("Digite o CPF do cliente: ");
				cliente[i].CPF = teclado.nextLine();
				System.out.print("Digite em minutos o tempo que o cliente permaneceu com o carro: ");
				cliente[i].minutos = teclado.nextInt();
				System.out.println();
				return;
			}
			
		}
		
		System.out.println("Já existem 5 cliente cadastrados!\n");
		return;
		
	}
	
	public void Listar() {
		
		int aux = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].Nome.equals("")){
				aux++;
			}else {
				System.out.println("Nome: " + cliente[i].Nome);
				System.out.println("CPF: " + cliente[i].CPF);
				System.out.println("Valor Pago: " + String.format("%.2f",cliente[i].Conta()) +"\n");
				
			}
		}
		
		if(aux == cliente.length) {
			System.out.println("Não há clientes cadastrados!\n");
		}
		
	}
	
	public void MelhorCompra() {
		
		int minuto = 0;
		int aux = 0, aux2 = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].Nome.equals("")) {
				aux2++;
			}else {
				
				if(i == 0) {
					minuto = cliente[i].minutos;
					aux = i;
					
				}else if (cliente[i].minutos > minuto) {
					minuto = cliente[i].minutos;
					aux = i;
				}
			
			}
		}
		
		if(aux2 == cliente.length) {
			System.out.println("Não há clientes cadastrados\n");
		
		}else {
			
		System.out.println("Cliente da Semana");
		System.out.println("Nome: " + cliente[aux].Nome);
		System.out.println("Alugou o carro por " + minuto + " minutos");
		System.out.println("Pagando para a loja: " + String.format("%.2f" ,cliente[aux].Conta()) + "\n");
		}
		
		
	}
	
	public void Saldo() {
		
		double saldo = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].Nome.equals("")) {
				
			}else {
				saldo += cliente[i].Conta();
			}
		}
		System.out.println("O faturamento total da semana passada ficou em: R$ " + String.format("%.2f", saldo) + "\n");
	}
}
