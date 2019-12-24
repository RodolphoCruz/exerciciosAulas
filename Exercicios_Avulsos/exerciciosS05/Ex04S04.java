package exerciciosS05;

import java.util.Scanner;

public class Ex04S04 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int ini,fim,duração;
		System.out.print("Insira o inicio e fim");
		ini=sc.nextInt();
		fim=sc.nextInt();
		if(ini>=fim) {
			duração=24-ini+fim;
		}
		else {
			duração=fim-ini;
		}
		System.out.printf("O jogo durou %d hrs",duração);
		sc.close();
	}

}
