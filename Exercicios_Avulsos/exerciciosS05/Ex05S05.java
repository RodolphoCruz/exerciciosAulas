package exerciciosS05;

import java.util.Scanner;

public class Ex05S05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int cod;
		double qnt,total;
		String erro; 
		cod=sc.nextInt();
		qnt=sc.nextDouble();
		if(cod==1) {
			total=qnt*4;
			erro=null;
		}
		else if(cod==2) {
			total=qnt*4.5;
			erro=null;
		}
		else if(cod==3) {
			total=qnt*5;
			erro=null;
		}
		else if(cod==4) {
			total=qnt*2;
			erro=null;
		}
		else if(cod==5) {
			total=qnt*1.5;
			erro=null;
		}
		else{
			erro="código invalido";
			total=0;
		}
		if(total!=0) {
			System.out.printf("total: R$: %.2f",total);
		}
		else {
			System.out.println(erro);
		}

		sc.close();
	}

}
