
public class Teste {

static int x = 10; //Variável Global. Pode operar em qualquer método que opere com POO (programação orientada a objeto)
	
	public static void main(String[] args) {
	int x = 2; //Variável Global (escopo da variável)
	int y = 3;
	int z;
	teste(x,y); //se colocarmos algo dentro do parenteses, será uma váriavel que ira para o outro método
	System.out.print(operação(x,y));
	
	}
	public static void teste(int x, int y) {
		System.out.println(x+" , "+y);
	}
	public static int operação(int x, int y){
		int resultado;
		resultado = x + y;
		return resultado;
	}
	
}
