import javax.swing.JOptionPane;

public class ex0805_09 {
	public static void main (String [] args ) {

		int vetor[] = new int[20], par = 0;

		for(int i = 0; i <= 19; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero:"));
			if(vetor[i] % 2 == 0) {
				par++;
			}
		}

		if(par >= 1) {
			JOptionPane.showMessageDialog(null, "N�meros pares informados: "+par);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum n�mero par foi informado!");
		}

	}
}