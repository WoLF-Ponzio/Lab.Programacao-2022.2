import java.util.Scanner;
public class Impressão_Data {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String[] mes = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
	String[] data_split = new String[3];
	String data;
	
	
	System.out.print("Digite a data de nascimento (dd/mm/aaaa/): ");
	data = teclado.nextLine();
	data_split = data.split("/"); //O split serve para separar uma string por algum caractére em comum
	int numero = Integer.parseInt(data_split[1]); //O Integer serve para pegar alguma coisa que use o inteiro e precise de uma
												  //fórmula. Nele é possível pegar o valor máximo, transformar uma string em
												  //em numero e etc
	
	System.out.println("Você nasceu no dia " + data_split[0] + " de " + mes[(numero-1)] + " de " + data_split[2]);
	}

}
