import static javax.swing.JOptionPane.showConfirmDialog;

import javax.swing.JOptionPane;

public class Exemplo_Entrada_E_Saida {

	public static void main(String[] args) {
		int dialogButton = JOptionPane.YES_NO_OPTION;

	JOptionPane.showMessageDialog(null, "teste");
	JOptionPane.showMessageDialog(null, "Logo vou embora", "Kboom", 3); //1�alinhamento, 2� Texto da mensagem, 3� t�tulo da mensagem, 4� Simbulo da mensagem
	int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
	if(dialogResult == JOptionPane.YES_OPTION){

	}
	}
}
