
public class Exerc�cio_5_Bin�rio {

	public static void main(String[] args) {
	int x = 128;
	
	binario(x);
	}
	
	public static void binario(int x) {
		if(x == 0) return;
		System.out.print(x % 2);
		binario(x / 2);
	
	}

}
