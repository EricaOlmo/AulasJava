import java.util.Scanner;

public class Valores {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		Float valor1;
		Float valor2;
		Float valor3;
		Float result;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		valor2 = scan.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		valor3 = scan.nextFloat();
		result = valor1 * valor2 * valor3;;
		System.out.println("A multiplicação dos valores é " + result);
	}
	
}