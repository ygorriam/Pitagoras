import java.util.Scanner;
public class ex8 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		double salario, reajuste= 0;
		
		
		System.out.println("Informe o salario:");
		salario = input.nextDouble();
		
		System.out.println("Informe a taxa de reajuste:");
		reajuste = input.nextDouble();
		
		
		{
			reajuste = ((salario*reajuste)/100)+salario;
			}
		
			
		
		
		 
        System.out.println("o reajuste sera de: " + reajuste);
		
		
		
		
	}//fim do metodo principal
}//fim da classe