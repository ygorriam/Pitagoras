import java.util.Scanner;
public class ex12 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int a, b, subtracao = 0;
		
		
		System.out.println("Informe o primeiro numero:");
		a = input.nextInt();
		
		System.out.println("Informe o segundo numero:");
		b = input.nextInt();
		
		if (a > b){
		{
			subtracao = a - b;
			}
		    
		    
	}else if (a < b)
			{
				subtracao = b - a;
				}
			    
		    
		System.out.println("resultado: " + subtracao);
		
		
		
		
	}//fim do metodo principal
}//fim da classe
