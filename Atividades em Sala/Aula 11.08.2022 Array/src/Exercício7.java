import java.util.Random;
import java.util.Scanner;
//O Random � uma classe que ser� importada como o Scanner
//Ela � respons�vel por gerar n�meros pseudo aleat�rios
//Eles podem ser inteiros ou doubles
public class Exerc�cio7 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
    int numeros;
    boolean tester;
    
    System.out.print("Insira a quantidade de n�meros aleat�rios: ");
    numeros = teclado.nextInt();
    
    int[]x = new int[numeros];
    for(int i = 0; i < x.length;) {
        x[i]=gerador.nextInt(10);
        tester = false;
        
        for(int j = 0; j < i; j++){
            if(x[i] == x[j]) {
            tester = true;
            break;
            }
        }
        if(tester == false) {
        	System.out.println(i+1 + "� " + x[i]);
        	i++;
        }
        
    }
    }

}