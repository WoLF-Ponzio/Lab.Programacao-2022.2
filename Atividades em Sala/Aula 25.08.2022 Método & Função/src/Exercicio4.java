import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a, b;
	
	System.out.println("Digite dois valores inteiros e positivos");
	System.out.print("1º valor: ");
	a = teclado.nextInt();
	System.out.print("2º valor: ");
	b = teclado.nextInt();
		
	mdc(a,b);
	}

public static void mdc(int a, int b) {
    int maior, mdc = 1;
	if (a>b) {
		maior = a;
	}else
		maior = b;
   System.out.printf("MDC (%d e %d): ",a,b);
  
     for(int i=2; i<=maior;++i){
         while ((a % i == 0) && (b % i == 0)){
             a=a/i;
             b=b/i;
             mdc = mdc*i;
         }
     }
   System.out.printf("%d\n",mdc);
    }
}

