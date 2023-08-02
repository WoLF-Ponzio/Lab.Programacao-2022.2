import java.util.Scanner;
public class Exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [5];
        preencher(x); // o x representa todos os elementos dentro do vetor(todos serão levados com o método)
        System.out.println("soma = " + somar(x));

    }
        public static void preencher(int[] x) {
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < x.length; i++) {
            System.out.print("Valor --> ");
            x[i] = teclado.nextInt();

        }







    }


        public static int somar (int[] x) {
            int total = 0;
            for (int i = 0; i < x.length; i++) {
                total = total + x[i]; // total = total + x[i];
            }
            return total;


            }
        

	}


