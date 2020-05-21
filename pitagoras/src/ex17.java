import java.util.Scanner;
public class ex17 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int num1, num2, num3, num4;
	
		System.out.println("Digite o primeiro numero:");
		num1 = input.nextInt();
		
		System.out.println("Digite o segundo numero:");
		num2 = input.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		num3 = input.nextInt();
		
		System.out.println("Digite o quarto numero:");
		num4 = input.nextInt();
		
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.println("Numeros em ordem crescente"+ num1 +","+ num2 +"," + num3 + ".");
		
		}else if(num1 <= num3 && num2 <= num1) {
			System.out.println("Numeros em ordem crescente"+ num2 +","+ num1 +"," + num3 + ".");
		
		}else if(num1 <= num2 && num2 <= num3) {
			System.out.println("Numeros em ordem crescente"+ num3 +","+ num2 +"," + num1 + ".");
		
		}else if(num1 <= num3 && num3 <= num2) {
			System.out.println("Numeros em ordem crescente"+ num1 +","+ num3 +"," + num2 + ".");
		
		}else if(num1 <= num3 && num2 <= num3) {
			System.out.println("Numeros em ordem crescente"+ num1 +","+ num3 +"," + num2 + ".");
		
		}else if(num1 <= num2 && num3 <= num1) {
			System.out.println("Numeros em ordem crescente"+ num3 +","+ num1 +"," + num2 + ".");
		
		}else if(num1 <= num3 && num3 <= num2) {
			System.out.println("Numeros em ordem crescente"+ num2 +","+ num3 +"," + num1 + ".");
		}
		
		
		
		
		
		
		
		
	}
}