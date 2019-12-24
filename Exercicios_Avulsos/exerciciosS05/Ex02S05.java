package exerciciosS05;

import java.util.Scanner;

public class Ex02S05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		
		sc.close();
	}

}