
public class Exercício_Criptografia {

	public static void main(String[] args) {
	String texto_original;
	int letra;
	
	texto_original = "Texto Original";
	
	String[]texto_codificado = texto_original.split("");
	System.out.println(texto_codificado[0]);
	letra = texto_codificado[0];
	
	String a = Character.toString(97);
	System.out.println(a);
	}

}
