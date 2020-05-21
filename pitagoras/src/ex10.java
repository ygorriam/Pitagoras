import java.util.Scanner;
public class ex10 {
     public static void main(String [] args) {
    	 Scanner input = new Scanner(System.in);
    	 
    	 int num1, num2 = 0;
    	 
    	 System.out.println("digite o primeiro numero");
    	 num1 = input.nextInt();
    	 
    	 System.out.println("digite o segundo numero");
    	 num2 = input.nextInt();
    	 
    	 if(num1 > num2) {
    		 System.out.println("este numero e maior:"+num1); 
    	 }else if(num1 < num2) {
    		 System.out.println("este numero e maior:"+num2);
    	 }
     }
}