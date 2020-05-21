import java.util.Scanner;
public class ex4 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
	
		int idade = 0;
		int totalDias = 0;
		
		System.out.println("digite sua idade:");
		idade = input.nextInt();
		
		
		
		totalDias = idade*365;
		
		System.out.println("O total de dias é: "+totalDias);
		
	
	}//fim do metodo principal
}//fim da classe
