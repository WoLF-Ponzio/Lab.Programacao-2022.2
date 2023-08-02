import java.util.Scanner;
import java.util.Random;
public class Exercício3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
    int divisao = 0, primo = 0, quantidade;

    System.out.print("Informe a quantidade de números: ");
    quantidade = teclado.nextInt();
    int[]x = new int[quantidade];
    System.out.println("Adicionando valores aleatórios a variável");
    	for(int i = 0; i < x.length; i++) {
        x[i] = gerador.nextInt(10);
        System.out.print(x[i] + " ");
    }
    for(int i = 0; i < x.length; i++) {
        for(int divisor = 1; divisor <= x[i]; divisor++) {
            if(x[i] % divisor == 0) {
                divisao++;

            }
        }
        System.out.println("");
        if(divisao == 2) {
            System.out.println("O numero " + x[i] + " é primo" );
            primo++;
        }
        divisao=0;
    }
    System.out.println("Foi inserido " + primo + " numeros primos");


    }

}