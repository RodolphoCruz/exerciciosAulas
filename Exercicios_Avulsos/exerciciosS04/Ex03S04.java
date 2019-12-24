package exerciciosS04;
import java.util.Scanner;

public class Ex03S04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, dif;

		System.out.print("Insira o valor a:");
		a = sc.nextInt();
		System.out.print("Insira o valor b:");
		b = sc.nextInt();
		System.out.print("Insira o valor c:");
		c = sc.nextInt();
		System.out.print("Insira o valor d:");
		d = sc.nextInt();
		dif = a * b - c * d;
		System.out.println("Diferença dos produtos:" + dif);

		sc.close();
	}

}
