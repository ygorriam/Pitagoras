import java.util.Scanner;
public class ex21 {
 public static void main (String [] args) {
	 Scanner input = new Scanner(System.in);
	 
	 double salario, reajuste, salarionovo = 0;
	 
	 System.out.println("Informe o seu salario");
	 salario = input.nextInt();
	 
	 if(salario >= 965) {
		 reajuste = (salario*8)/100;
		 salarionovo = salario-reajuste;
		 System.out.println("seu salario liquido é"+salarionovo);
	 }else if(salario >= 966) {
		 reajuste = (salario*9)/100;
		 salarionovo = salario-reajuste;
		 System.out.println("seu salario liquido é"+salarionovo);
	 }else if(salario > 1609) {
		 reajuste = (salario*11)/100;
		 salarionovo = salario-reajuste;
		 System.out.println("seu salario liquido é"+salarionovo);
	 }
	 
 }
}
	