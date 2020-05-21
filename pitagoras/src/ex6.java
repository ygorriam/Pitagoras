import java.util.Scanner;
 public class ex6 {
	 public static void main(String [] args) {
				Scanner input = new Scanner (System.in);
				
				double num1 = 0;
				double num2 = 0;
				double num3 = 0;
				double resultado = 0;
				
				System.out.println("Informe a media (km/l) de consumo:");
				num1 = input.nextDouble();
				
				System.out.println("Informe a Distancia em KM:");
				num2 = input.nextDouble();
				
				System.out.println("Informe o Preço da Gasolina:");
				num3 = input.nextDouble();
				
				resultado = num1 / (num2 * num3);
				
				System.out.println("a soma dos numeros é: "+resultado);
				
			
			}//fim do metodo principal
		}//fim da classe
		 
