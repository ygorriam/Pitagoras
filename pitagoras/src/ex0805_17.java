import javax.swing.JOptionPane;

public class ex0805_17 {
	public static void main (String [] args ) {

		int [] cod = {21 ,5, 12, 14, 8};
		String [] nome = {"Notebook", "Mem�ria", "Disco R�gido", "Pendrive", "Mouse"};
		double preco[] = {1800, 120, 200, 55, 25};
		boolean encontrado = false;

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o C�digo do Produto:"));

		for (int i=0; i < cod.length; i++) {
			if(codigo == cod[i]) {
				JOptionPane.showMessageDialog(null, "Produto Encontrado:\n\n"
						+ nome[i]+" - R$ "+String.format("%,.2f", preco[i]));
				encontrado = true;
			}
		}
		if(!encontrado) {
			JOptionPane.showMessageDialog(null, "Produto n�o Encontrado!");
		}

	}
}