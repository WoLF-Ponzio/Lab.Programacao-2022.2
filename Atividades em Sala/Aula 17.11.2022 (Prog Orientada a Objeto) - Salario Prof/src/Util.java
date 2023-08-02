import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	private Professor[] professor = new Professor[5];
	int posicao = 0;

	// método para controlar o menu da aplicação
	public void menu() {
		String aux = "Escolha uma operação\n1 - Cadastrar\n2 - Pesquisar\n3 - Listar\n4 - finalizar";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção inválida");
			} else {
				switch (opcao) {

				case 1:
					if (posicao >= professor.length) {
						showMessageDialog(null, "Procure o Departamente Pessoal");
					} else {
						cadastrar();
						posicao++;
					}
					break;
				case 2:
					pesquisar();
					break;
				case 3:
					listar();
					break;
				}
			}

		} while (opcao != 4);
	}

	public void cadastrar() {
		professor[posicao] = new Professor();
		professor[posicao].nome = showInputDialog("Nome");
		professor[posicao].cpf = showInputDialog("CPF");
		professor[posicao].totalDeAulas = parseInt(showInputDialog("Total de Aulas"));
		professor[posicao].valorDaAula = parseDouble(showInputDialog("Valor da Aula"));

	}

	public void pesquisar() {
		Scanner teclado = new Scanner(System.in);
		String pesquisa;

		pesquisa = showInputDialog("Digite o CPF do Professor");
		for (int i = 0; i < posicao; i++) {
			if (professor[i].cpf.equals(pesquisa)) {
				showMessageDialog(null, professor[i].getDados());
			}
		}

	}

	public void listar() {
		for (int i = 0; i < posicao; i++) {
			showMessageDialog(null, professor[i].getDados());
		}
	}
}
