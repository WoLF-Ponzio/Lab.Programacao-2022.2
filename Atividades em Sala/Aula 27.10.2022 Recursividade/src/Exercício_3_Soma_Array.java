
public class Exercício_3_Soma_Array {

	public static void main(String[] args) {
	int[] x = {1,2,3,4,5,6,7,8,9,10};

	System.out.println(soma(x, x.length));
	}

	public static int soma(int x[], int i) {
		if(i == 0) return 0;
		int somar;
		somar = x[i-1] + soma(x, i-1);
		return somar;
	}
}
