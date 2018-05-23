import java.util.Scanner;

public class Somas {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int result;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = scan.nextInt();
		result = valor1 + valor2;
		System.out.println("O resultado é " + result);
		
	}
	
}