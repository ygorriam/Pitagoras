import java.util.*;
import javax.swing.JOptionPane;

public class ex0805_10 {
	public static void main (String [] args ) {

		int vetorA[] = new int[10], vetorB[] = new int[10], vetorUnido[] = new int[20];

		for(int i = 0; i <= 9; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero do Vetor A:"));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero do Vetor B:"));
		}

		System.arraycopy(vetorA, 0, vetorUnido, 0, 10);
		System.arraycopy(vetorB, 0, vetorUnido, 10, 10);

		JOptionPane.showMessageDialog(null, "Vetores Unidos: "+Arrays.toString(vetorUnido));

	}

}