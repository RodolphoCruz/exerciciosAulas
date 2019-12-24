package exerciciosS04;
import java.util.Scanner;

public class Ex05S04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod1, n1;
		double v1;
		System.out.print("Insira o código do produto c, numero de produtos n e o valor do produto v.\nc n v: ");
		cod1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();

		System.out.print("Insira o código do produto c, numero de produtos n e o valor do produto v.\nc n v: ");
		int cod2, n2;
		double v2;
		cod2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();

		System.out.printf("Valor %d: R$ %.2f%nValor %d: R$ %.2f%nValor total: R$ %.2f", cod1, n1 * v1, cod2, n2 * v2,
				n1 * v1 + n2 * v2);

		sc.close();
	}

}
