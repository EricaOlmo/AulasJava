// informar dois numeros e exibir o menor antes do maior
import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Informe um numero:");
		num1 = scan.nextInt();
		System.out.println("Informe um numero:");
		num2 = scan.nextInt();

		if (num1 < num2) {
			System.out.println(num1);
			System.out.println(num2);
		} else {
			System.out.println(num2);
			System.out.println(num1);
		}

	}
}