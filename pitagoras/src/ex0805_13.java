import java.util.*;
import javax.swing.JOptionPane;

public class ex0805_13 {
	public static void main (String [] args ) {

		int vetor[] = new int[10], par = 0;

		for(int i = 0; i <= 9; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero:"));
			if(vetor[i] % 2 == 0) {
				par++;
			}
		}

		if(par >= 1) {

			int vetorPares[] = new int[par];
			par = 0;

			for(int i = 0; i <= 9; i++) {
				if(vetor[i] % 2 == 0) {
					vetorPares[par] = vetor[i];
					par++;
				}
			}
			JOptionPane.showMessageDialog(null, "N�meros pares informados: "+Arrays.toString(vetorPares));
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum n�mero par foi informado!");
		}

	}
}