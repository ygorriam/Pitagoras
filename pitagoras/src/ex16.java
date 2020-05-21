import java.util.Scanner;
public class ex16 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		int valorx = 0, valory = 0;
		int quociente = 0;
		int resto = 0;
		
		System.out.println("Digite o primeiro valor:");
		valorx = input.nextInt();
		System.out.println("Digite o primeiro valor:");
		valory = input.nextInt();
		
		if(valory >0) {
			quociente = valorx/valory;
			resto = valorx%valory;
			System.out.println("o seu quociente sera igual:"+quociente);
			System.out.println("Digite o primeiro valor:"+resto);
		}else {
			System.out.println("nao e possivel realizar a divisao porque o y tem que ser maior ou igual  0:");
		}

}
}