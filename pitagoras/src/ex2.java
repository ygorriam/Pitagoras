import java.util.Scanner;
public class ex2 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		double altura = 0;
		double largura = 0;
		
		
		
		System.out.println("Informe a altura:");
		altura = input.nextInt();
		
		System.out.println("Informe a largura:");
		largura = input.nextInt();
		
		double resultado = largura * altura;
		 
        System.out.println("A �rea total e: " + resultado);
		
		
		
		
	}//fim do metodo principal
}//fim da classe
