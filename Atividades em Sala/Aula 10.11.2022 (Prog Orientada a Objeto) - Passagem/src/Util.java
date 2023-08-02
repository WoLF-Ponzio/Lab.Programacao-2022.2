import static javax.swing.JOptionPane.*;
import java.util.Random;
import static java.lang.Integer.parseInt;
public class Util {
	
	Passagem [] passagem = new Passagem[5];
	
	//Metodo que irá fazer a entrada de dados
	public void inserir() {
		Random gerador = new Random();
		for(int i = 0; i < passagem.length; i++) {
			passagem[i] = new Passagem();
			passagem[i].numero = gerador.nextInt(1000,9999);
			passagem[i].nomePassageiro = showInputDialog("Nome do Passageiro");
			passagem[i].destino = showInputDialog("Destino");
			passagem[i].idade = parseInt(showInputDialog("Idade"));
		}
	}
	
	
	//Método para imprimir os passageiros acima da média de idade
	public void ImprimirPassageiro() {
		double media = 0;
		String aux = "Os passageiros acima da média são: ";
		for(int i = 0; i < passagem.length; i++) {
			media += passagem[i].idade;
		}
		media /= passagem.length;
		for(int i = 0; i < passagem.length; i++) {
			if(passagem[i].idade > media) {
				aux += passagem[i].nomePassageiro + "\n";
			}
		}
	showMessageDialog(null, aux);

	}
}
