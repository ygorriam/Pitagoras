import java.util.*;
import javax.swing.JOptionPane;

public class ex0805_14 {
	public static void main (String [] args ) {

		int vetorA[] = new int[10], vetorB[] = new int[10], vetorSoma[] = new int[10];

		for(int i = 0; i <= 9; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero do Vetor A:"));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero do Vetor B:"));
			vetorSoma[i] = vetorA[i]+vetorB[i];
		}

		JOptionPane.showMessageDialog(null, "Vetor A: "+Arrays.toString(vetorA)+"\n"
				+ "Vetor B: "+Arrays.toString(vetorB)+"\n"
				+ "Soma das Respectivas Posi��es de A e B: "+Arrays.toString(vetorSoma));

	}
}