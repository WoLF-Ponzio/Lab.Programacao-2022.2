import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c;

	
	System.out.println("Insira 3 valores positivos e descubra se form�o um tri�gulo");
		System.out.print("1� Valor: ");
		a = teclado.nextDouble();
		System.out.print("2� Valor: ");
		b = teclado.nextDouble();
		System.out.print("3� Valor: ");
		c = teclado.nextDouble();
		if(a <= 0 || b <= 0 || c<= 0) {
			System.out.println("Entrada Inv�lida");
		}else {
			print(a,b,c);
		}
	
		}
	
	
	
public static void print(double a, double b, double c) {
	if (a>(b+c) ||  b>(a+c) || c>(a+b)){
        System.out.println("N�o � um tri�ngulo v�lido");
	}else if ( a == b && a == c) {
        System.out.print("Tri�ngulo equil�tero! ");

    }else if ( a == b && a == c && b == c){
        System.out.print("Tri�ngulo is�sceles! ");

    }else {
        System.out.print("Tri�ngulo escaleno! ");
    }
	}
}

