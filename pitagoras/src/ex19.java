import java.util.Scanner;
public class ex19 {
     public static void main(String [] args) {
    	 Scanner input = new Scanner(System.in);
    	 
    	 int num1, num2, num3, num4 = 0;
    	 
    	 System.out.println("digite o primeiro numero:");
    	 num1 = input.nextInt();
    	 
    	 System.out.println("digite o segundo numero:");
    	 num2 = input.nextInt();
    	 
    	 System.out.println("digite o terceiro numero:");
    	 num3 = input.nextInt();
    	 
    	 System.out.println("digite o terceiro numero:");
    	 num4 = input.nextInt();
    	 
    	 if(num1 > num2 || num1 > num3 || num1 >num4) {
    		 System.out.println("este numero e maior:"+num1); 
    	 }else if(num2 > num3 || num2>num4) {
    		 System.out.println("este numero e maior:"+num2);
    	 }else if (num3 > num4)
    	 {System.out.println("este numero e maior:"+num3);
    		 }else{
    			 System.out.println("este numero e maior:"+num4);
    		 }
    	 
    	 
    	 
    	 
     
     
     
     
     
     }
}