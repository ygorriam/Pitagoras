import java.util.Scanner;
public class ex28 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int tipocompra, produto = 0;
		
		System.out.println("Informe o produto desejado");
		
		System.out.println("qual o produto desejado");
		 System.out.println("1-impressora HP");
		 System.out.println("2-notebook Dell");
		 System.out.println("3-Mouse optico");
		 System.out.println("4-pendrive 16gb");
		 produto = input.nextInt();
		 switch(produto) {
		 
		 case 1:
			 
			 System.out.println("impressora da marca HP no valor de R$400,00");
			 
			 break;
		 
		 case 2:
			 
			 System.out.println("notebook da marca Dell no valor de R$1800,00");
			 
			 break;
			 
		case 3:
	 
			System.out.println("Mouse optico no valor de R$50,00");
	 
			break;
			
		case 4:
			 
			 System.out.println("pen drive de 16gb R$60,00");
			 
			 break;	
	}

	}
}
