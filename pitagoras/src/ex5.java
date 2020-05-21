import java.util.Scanner;
public class ex5 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Informe a nota da prova 1:");
		int a = input.nextInt();
		
		System.out.println("Informe a nota da prova 2:");
		int b = input.nextInt();
		
		System.out.println("Informe a nota da prova 3:");
		int c = input.nextInt();
		
		int media = (a + b + c)/3;
		 
        System.out.println("A nota media é: " + media);
		
		
		
		
	}//fim do metodo principal
}//fim da classe