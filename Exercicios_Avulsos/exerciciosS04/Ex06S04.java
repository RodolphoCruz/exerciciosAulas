package exerciciosS04;
import java.util.Scanner;

public class Ex06S04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, at, ac, atr, aq, ar;
		System.out.print("Insira A,B,C.\nA B C: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		at = a * c / 2;
		ac = 3.14159 * c * c;
		atr = (a + b) * c / 2;
		aq = b * b;
		ar = a * b;
		System.out.printf("Triangulo: %.3f%n", at);
		System.out.printf("Circulo: %.3f%n", ac);
		System.out.printf("Trapézio: %.3f%n", atr);
		System.out.printf("Qadrado: %.3f%n", aq);
		System.out.printf("Retangulo: %.3f%n", ar);

		sc.close();
	}

}
