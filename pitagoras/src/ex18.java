import java.util.Scanner;
public class ex18 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		String nome1 = "";
		String nome2 = "";
		
		
		System.out.println("digite o primeiro nome:");
		nome1 = input.next();
		
		
		System.out.println("digite o segundo nome:");
		nome2 = input.next();
		
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("São Xáras");
		}else {
			System.out.println("Nao são Xáras");
		}
		
		
		
	}

}