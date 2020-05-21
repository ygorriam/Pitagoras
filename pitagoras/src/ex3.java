import java.util.Scanner;
public class ex3 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		double raio = 0;
		final double pi = 3.14;
		
		System.out.println("Informe o raio da circunferencia:");
		raio = input.nextInt();
		
		double area = pi * (raio*raio);
		 
        System.out.println("o raio da circunferencia é: " + area);
		
		
		
		
	}//fim do metodo principal
}//fim da classe