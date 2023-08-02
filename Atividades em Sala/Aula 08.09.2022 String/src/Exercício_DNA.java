import java.util.Scanner;
public class Exerc�cio_DNA {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String dna, rna = "";
	
	System.out.print("Digite uma sequ�ncia de DNA: ");
	dna = teclado.next();
	dna = dna.toUpperCase();

	for(int i = 0; i < dna.length(); i++) {
		switch(dna.charAt(i)) {
			case 'A':
				rna += 'T';
				break;
			case 'T':
				rna += 'A';
				break;
			case 'C':
				rna += 'G';
				break;
			case 'G':
				rna += 'C';
		}
			//O switch case serve para organizar melhor os casos
	}
		System.out.println("A cadeia de RNA ser�: " + rna);
	}

}
