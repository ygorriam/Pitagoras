import java.util.Scanner;
public class ex1 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int resultado = 0;
		
		System.out.println("Informe o numero 1:");
		num1 = input.nextInt();
		
		System.out.println("Informe numero 2:");
		num2 = input.nextInt();
		
		System.out.println("Informe o numero3:");
		num3 = input.nextInt();
		
		resultado = num1 + num2 + num3;
		
		System.out.println("a soma dos numeros �: "+resultado);
		
	
	}//fim do metodo principal
}//fim da classe