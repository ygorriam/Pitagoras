import javax.swing.JOptionPane;
public class ex0805_7 {
	public static void main (String [] args ) {

		int numeros[] = new int[10], posicaoA = 0, posicaoB = 0;

		for(int i = 0; i <= 9; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero:"));
		}

		posicaoA = Integer.parseInt(JOptionPane.showInputDialog("Informe a Posi��o A de 1 a 10:"));
		for(int i = 0; i <= 9; i++) {
			if(posicaoA >= 1 && posicaoA <= 10) {
				i = 9;
			} else {
				posicaoA = Integer.parseInt(JOptionPane.showInputDialog("Voc� n�o informou um valor de 1 a 10.\n Informe novamente a Posi��o A de 1 a 10:"));
				i = 0;
			}
		}

		posicaoB = Integer.parseInt(JOptionPane.showInputDialog("Informe a Posi��o B, de 1 a 10:"));
		for(int i = 0; i <= 9; i++) {
			if(posicaoB >= 1 && posicaoB <= 10) {
				i = 9;
			} else {
				posicaoB = Integer.parseInt(JOptionPane.showInputDialog("Voc� n�o informou um valor de 1 a 10.\n Informe novamente a Posi��o B de 1 a 10:"));
				i = 0;
			}
		}

		JOptionPane.showMessageDialog(null, "O n�mero da Posi��o A � "+numeros[posicaoA-1]+" e o n�mero da Posi��o B � "+numeros[posicaoB-1]+"!");	

	}
}