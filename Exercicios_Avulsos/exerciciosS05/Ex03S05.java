package exerciciosS05;

import java.util.Scanner;

public class Ex03S05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		//Uma forma
/* 		int mutiplicidade;
  		mutiplicidade=(a>b)?a%b:b%a;
		if (mutiplicidade==0) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Não multiplos");
		}
*/
		//Outra Forma
		if(a%b==0 || b%a==0) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Não multiplos");
		}
		
		sc.close();
	}

}
