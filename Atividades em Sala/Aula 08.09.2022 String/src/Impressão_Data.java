import java.util.Scanner;
public class Impress�o_Data {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String[] mes = {"janeiro","fevereiro","mar�o","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
	String[] data_split = new String[3];
	String data;
	
	
	System.out.print("Digite a data de nascimento (dd/mm/aaaa/): ");
	data = teclado.nextLine();
	data_split = data.split("/"); //O split serve para separar uma string por algum caract�re em comum
	int numero = Integer.parseInt(data_split[1]); //O Integer serve para pegar alguma coisa que use o inteiro e precise de uma
												  //f�rmula. Nele � poss�vel pegar o valor m�ximo, transformar uma string em
												  //em numero e etc
	
	System.out.println("Voc� nasceu no dia " + data_split[0] + " de " + mes[(numero-1)] + " de " + data_split[2]);
	}

}
