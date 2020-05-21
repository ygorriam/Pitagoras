import java.util.Scanner;
public class ex13 {
 public static void main(String [] args) {
	 Scanner input = new Scanner(System.in);
	 
	 int numero = 0;
	 
	 System.out.println("Digite o numero");
	 numero = input.nextInt();
	
	 
     if((numero  % 2) == 0)  
        System.out.println("par");
     else 
        System.out.println("impar");
	 
	 
	 
 }
}