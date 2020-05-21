import java.util.Scanner;
public class ex7 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		double peso = 0;
		double altura = 0;
		double imc;
		
		
		
		System.out.println("Informe o peso :");
		peso = input.nextDouble();
		
		System.out.println("Informe a altura:");
		altura = input.nextDouble();
		
		imc = peso /(altura*altura);
		
		if(imc  < 18.5) {
			
			System.out.println("Abaixo do peso");
		}
		
		else if(imc  >= 18.6 && imc <=24.9) {
			
			System.out.println("Saudavel");
		}
		
		else if(imc >= 25 && imc <=29.9) {
			
			System.out.println("Peso em excesso");
			
		}
		
		imc = peso / (altura*altura);
		
		System.out.println("o Seu IMC é: "+imc);
		
	
	}//fim do metodo principal
}//fim da classe