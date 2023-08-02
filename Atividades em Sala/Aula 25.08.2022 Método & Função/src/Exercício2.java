import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c;

	
	System.out.println("Insira 3 valores positivos e descubra se formão um triâgulo");
		System.out.print("1º Valor: ");
		a = teclado.nextDouble();
		System.out.print("2º Valor: ");
		b = teclado.nextDouble();
		System.out.print("3º Valor: ");
		c = teclado.nextDouble();
		if(a <= 0 || b <= 0 || c<= 0) {
			System.out.println("Entrada Inválida");
		}else {
			print(a,b,c);
		}
	
		}
	
	
	
public static void print(double a, double b, double c) {
	if (a>(b+c) ||  b>(a+c) || c>(a+b)){
        System.out.println("Não é um triângulo válido");
	}else if ( a == b && a == c) {
        System.out.print("Triângulo equilátero! ");

    }else if ( a == b && a == c && b == c){
        System.out.print("Triângulo isósceles! ");

    }else {
        System.out.print("Triângulo escaleno! ");
    }
	}
}

