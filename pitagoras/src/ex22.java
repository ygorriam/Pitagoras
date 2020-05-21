import java.util.Scanner;
public class ex22 {
	public static void main (String [] args) {
	 Scanner input = new Scanner(System.in);
	 
	 String nome ;
	 int nota1, nota2, nota3, resultado = 0;
	 
	 
	 System.out.println("Informe o nome do aluno");
	    nome= input.next();
	 
	 System.out.println("Informe a primeira nota");
	    nota1= input.nextInt();
	    
	    System.out.println("Informe a segunda nota");
	    nota2= input.nextInt();
	    
	    System.out.println("Informe a terceira nota");
	    nota3= input.nextInt();
	    
	    resultado = ((nota1+nota2+nota3)/3);
	    
	    if(resultado > 7) {
	    System.out.println("aprovado: "+resultado+nome);
	    }else if(resultado < 7 ) {
	    	System.out.println("reprovado: "+resultado+nome);
	    }
	    
	    
	 
	}

}
