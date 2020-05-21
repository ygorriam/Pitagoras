import java.util.Scanner;
public class ex9 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		double distancia = 0;
		double tempo = 0;
		double resultado = 0;
		
		System.out.println("Informe a distancia em KM:");
		distancia = input.nextInt();
		
		System.out.println("Informe o tempo gasto:");
		tempo = input.nextInt();
		
		
		
		resultado = distancia / tempo;
		
		System.out.println("a velocidade media e: "+resultado);
		
	
	}//fim do metodo principal
}//fim da classe