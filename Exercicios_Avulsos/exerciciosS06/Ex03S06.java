package exerciciosS06;

import java.util.Scanner;

public class Ex03S06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool=0;
		int gasolina=0;
		int diesel=0;
		int pedido=sc.nextInt();
		while (pedido != 4) {
			if(pedido==1) {
				alcool+=1;
			}
			else if(pedido==2) {
				gasolina+=1;
			}
			else if(pedido==3) {
				diesel+=1;
			}
			else {}
			pedido=sc.nextInt();			
		}
		
		System.out.printf("MUITO OBRIGADO!\nAlcool: %d\nGasolina: %d\nDiesel: %d",alcool,gasolina,diesel);
		
		sc.close();
	}

}
