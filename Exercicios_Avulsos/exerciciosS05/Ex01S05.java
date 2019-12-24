package exerciciosS05;

import java.util.Scanner;

public class Ex01S05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("não negativo");
		}
		
		
		sc.close();
	}

}
