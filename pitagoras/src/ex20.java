import java.util.Scanner;
public class ex20 {
	public static void main (String [] args) {
		 Scanner input = new Scanner(System.in);
		
		 double salario = 0;
		 double reajuste = 0;
		 
		 System.out.println("Informe o salario");
		  salario = input.nextDouble();
		    
		    if(salario <= 500) {
		    reajuste = salario * 0.3;
		   System.out.println("seu reajuste é de : "+reajuste);
		   }else if( salario > 500) {
			   System.out.println("voce nao possui reajuste");
		   }
		 
		 
	}
	}