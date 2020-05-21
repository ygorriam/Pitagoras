import java.util.Scanner;
public class ex14 {
     public static void main(String [] args) {
    	 Scanner input = new Scanner(System.in);
    	 
    	 int numero = 0;
    	 System.out.println("digite o numero");
    	 numero = input.nextInt();
    	 
    	 if(numero > 0) {
    		 System.out.println("este numero e positivo:"+numero); 
    	 }else if(numero < 0) {
    		 System.out.println("este numero e negativo:"+numero);
    	 }else {
    		 System.out.println("este numero e neutro:"+numero);
    	 }
     }
}