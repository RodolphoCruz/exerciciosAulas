package exerciciosS06;

import java.util.Scanner;

public class Ex01S06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String chave="2002";
		System.out.print("Senha:");
		String senha=(String) sc.nextLine();
		
		while (senha.equals(chave)==false){
			System.out.println("Senha invalida");
			System.out.print("Senha:");
			senha=(String)sc.nextLine();
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
