package exerciciosS04;
import java.util.Scanner;

public class Ex04S04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		double h, v;

		System.out.print("Insira seu numero: ");
		n = sc.nextInt();
		System.out.print("Insira suas horas trabalhadas: ");
		h = sc.nextDouble();
		System.out.print("Valor que recebe por hora: ");
		v = sc.nextDouble();

		System.out.println("Number = " + n);
		System.out.printf("Salary = R$ %.2f", v * h);
		sc.close();
	}

}
