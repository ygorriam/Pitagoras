  
import javax.swing.JOptionPane;
public class ex0802_06 {
	public static void main (String [] args ) {

		int qtdInformar = 0, qtdPositivos = 0, qtdNegativos = 0, numero = 0;
		String pluralPositivo = "", pluralNegativo = "";

		qtdInformar = Integer.parseInt(JOptionPane.showInputDialog("Quandos n�meros deseja informar?"));

		for(int i = 1; i <= qtdInformar; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+i+"� n�mero:"));
			if(numero >= 0) { qtdPositivos++; } else { qtdNegativos++; }
		}

		if(qtdPositivos > 1) { pluralPositivo = "s"; }
		if(qtdNegativos > 1) { pluralNegativo = "s"; }

		JOptionPane.showMessageDialog(null, "Foram informados "+qtdPositivos+" n�mero"+pluralPositivo+" Positivo"+pluralPositivo+" e "
				+ ""+qtdNegativos+" n�mero"+pluralNegativo+" Negativo"+pluralNegativo+"!");	

	}
}