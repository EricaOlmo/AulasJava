//some dois numeros que o usuario inserir
import java.util.Scanner;

public class EX04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		int soma;

		System.out.println("Digite o primeiro numero:");
		num1 = scan.nextInt();

		System.out.println("Digite o segundo numero:");
		num2 = scan.nextInt();

		soma = num1 + num2;

		System.out.println(" A soma é "+soma);


	}

}