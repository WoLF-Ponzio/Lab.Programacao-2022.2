import java.util.Scanner;
public class Exercício3_5 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[]x = new int[5];
    int divisao = 0, primo = 0;

    for(int i = 0; i < x.length; i++) {
        System.out.print("Insira um valor: ");
        x[i] = teclado.nextInt();
    }
    for(int i = 0; i < x.length; i++) {
        for(int divisor = 1; divisor <= x[i]; divisor++) {
            if(x[i] % divisor == 0) {
                divisao++;

            }
        }
        if(divisao == 2) {
            System.out.println("O numero " + x[i] + " é primo" );
            primo++;
        }
        divisao=0;
    }
    System.out.println("Foi inserido " + primo + " numeros primos");


    }

}