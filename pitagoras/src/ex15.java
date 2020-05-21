import java.util.Scanner;
public class ex15 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int a, b, subtracao = 0;
		
		
		System.out.println("Informe o primeiro numero:");
		a = input.nextInt();
		
		System.out.println("Informe o segundo numero:");
		b = input.nextInt();
		
		
		if ((a >= 0)&& b >= 0)  {
			subtracao = a - b;
			System.out.println("resultado: "+subtracao);
		}
		
		else if ((a < 0)&& b < 0)
			System.out.println("programa encerrado: ");
		    
		    
	
			    
		    
		
		
		
		
		
	}//fim do metodo principal
}//fim da classe