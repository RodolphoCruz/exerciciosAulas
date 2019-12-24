package exerciciosS04;
import java.util.Scanner;
public class Ex01S04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x,y,z;
		System.out.print("Insira um valor x:");
		x=sc.nextInt();
		System.out.print("Insira um valor y:");
		y=sc.nextInt();
		System.out.println("Entradas:");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("Saída:");
		z=x+y;
		System.out.println("x+y="+z);
		sc.close();

	}

}
