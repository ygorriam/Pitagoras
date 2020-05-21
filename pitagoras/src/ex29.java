import java.util.Scanner;
public class ex29 {
 public static void main (String [] args) {
	 Scanner input = new Scanner(System.in);
	 
	 double valor, valordesconto, valoracrescimo, valorfinal, valorparcelas =0;
	 int tipocompra =0;
	 
	 System.out.println("Informe o valor total da compra");
	 valor = input.nextInt();
	 
	 if(valor >0) {
		 System.out.println("qual a forma de pagamento?");
		 System.out.println("1-pagamento a vista - 15% desconto");
		 System.out.println("2-pagamento com cheque pre-datado - 10%desconto");
		 System.out.println("3-pagamento parcelado em 3x - 5%desconto");
		 System.out.println("4-pagamento parcelado em 6x - sem desconto");
		 System.out.println("5-pagamento parcelado em 12x - acrescimo de 8%");
		 tipocompra = input.nextInt();
		 
		 switch(tipocompra) {
		 case 1:
			 valordesconto = (valor*15)/100;
			 valorfinal = valor-valordesconto;
			 System.out.println("pagamento a vista");
			 System.out.println("valor total da sua compra R$"+valor);
			 System.out.println("valor do desconto R$"+valordesconto);
			 System.out.println("valor final da sua compra com desconto:R$"+valorfinal);
			 break;
		 case 2:
			 valordesconto = (valor*10)/100;
			 valorfinal = valor-valordesconto;
			 System.out.println("pagamento com cheque pre-datado");
			 System.out.println("valor total da sua compra R$"+valor);
			 System.out.println("valor do desconto R$"+valordesconto);
			 System.out.println("valor final da sua compra com desconto:R$"+valorfinal);
			 break;
			 
		 case 3:
			 valordesconto = (valor*5)/100;
			 valorfinal = valor-valordesconto;
			 System.out.println("pagamento parcelado em 3x:");
			 System.out.println("valor total da sua compra R$"+valor);
			 System.out.println("valor do desconto R$"+valordesconto);
			 System.out.println("valor final da sua compra com desconto:R$"+valorfinal);
			 break;
			 
		 case 4:
			 valordesconto = (valor*5)/100;
			 valorfinal = valor-valordesconto;
			 System.out.println("pagamento parcelado em 6x:");
			 System.out.println("valor total da sua compra R$"+valor);
			 System.out.println("valor do desconto R$"+valor);
			 System.out.println("valor final da sua compra com desconto:R$"+valorfinal);
			 break;
			 
		 case 5:
			 valordesconto = (valor*8)/100;
			 valorfinal = valor+valordesconto;
			 System.out.println("pagamento parcelado em 12x:");
			 System.out.println("valor total da sua compra R$"+valor);
			 System.out.println("valor do desconto R$"+valor);
			 System.out.println("valor final da sua compra com desconto:R$"+valorfinal);
			 break;
			 
			 
		 }
		 
	 }
 }
}
