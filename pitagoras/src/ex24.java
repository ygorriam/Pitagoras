import java.util.Scanner;

public class ex24 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int qtdLivros = 0;
		double aValor = 0.25, aFixo = 7.5, bValor = 0.5, bFixo = 2.5, totalA = 0, totalB = 0;
		
		System.out.println("Quantos Livros voc� quer comprar?");
		qtdLivros = input.nextInt();
		
		totalA = (qtdLivros*aValor)+aFixo;
		totalB = (qtdLivros*bValor)+bFixo;
		
		if(totalA <= totalB) {
			System.out.println("O Crit�rio A � a sua melhor op��o! Voc� pagar� um total de R$ "+totalA+" enquanto no Crit�rio B voc� iria pagar um total de R$ "+totalB+"!");
		} else {
			System.out.println("O Crit�rio B � a sua melhor op��o! Voc� pagar� um total de R$ "+totalB+" enquanto no Crit�rio A voc� iria pagar um total de R$ "+totalA+"!");
		}		
		
	}

}