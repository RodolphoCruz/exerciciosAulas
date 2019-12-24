package exerciciosS04;
import java.util.Scanner;

public class Ex02S04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r,a,p;
		p=3.14159;
		System.out.print("insira o valor do raio:");
		r=sc.nextDouble();
		a=p*r*r;
		System.out.printf("Área=%.4f",a);
		sc.close();
	}

}
