
public class Teste {

static int x = 10; //Vari�vel Global. Pode operar em qualquer m�todo que opere com POO (programa��o orientada a objeto)
	
	public static void main(String[] args) {
	int x = 2; //Vari�vel Global (escopo da vari�vel)
	int y = 3;
	int z;
	teste(x,y); //se colocarmos algo dentro do parenteses, ser� uma v�riavel que ira para o outro m�todo
	System.out.print(opera��o(x,y));
	
	}
	public static void teste(int x, int y) {
		System.out.println(x+" , "+y);
	}
	public static int opera��o(int x, int y){
		int resultado;
		resultado = x + y;
		return resultado;
	}
	
}
