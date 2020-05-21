import java.util.Scanner;
public class ex26 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		double salario, reajuste, salarionovo = 0;
		int cargo = 0;
		String nome = "";
		
		System.out.println("Informe o nome :");
		nome = input.next();
		
		{
			System.out.println("Informe o cargo :");
			 System.out.println("1-programador");
			 System.out.println("2-analista");
			 System.out.println("3-gerente");
			 cargo = input.nextInt();
		System.out.println("Informe o salario atual :");
		salario = input.nextInt();
		
		
		
		
		switch(cargo) {
		 case 1:
			 reajuste = (salario*5)/100;
			 salarionovo = salario+reajuste;
			 System.out.println("Seu nome"+nome);
			 System.out.println("Seu cargo"+cargo);
			 System.out.println("Salario antigo:"+ salario);
			 System.out.println("Seu novo salarioR$"+salarionovo);
			 break;
		 case 2:
			 reajuste = (salario*4)/100;
			 salarionovo = salario+reajuste;
			 System.out.println("Seu nome"+nome);
			 System.out.println("Seu cargo"+cargo);
			 System.out.println("Salario antigo:"+ salario);
			 System.out.println("Seu novo salarioR$"+salarionovo);;
			 break;
			 
		 case 3:
			 reajuste = (salario*3)/100;
			 salarionovo = salario+reajuste;
			 System.out.println("Seu nome"+nome);
			 System.out.println("Seu cargo"+cargo);
			 System.out.println("Salario antigo:"+ salario);
			 System.out.println("Seu novo salarioR$"+salarionovo);
			 
			
			 break;

		
		
	}
}
	}
}
