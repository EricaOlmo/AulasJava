import java.util.Scanner;

public class Inteiro {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int valor1;
		float resto;
		
		System.out.println("Digite um numero inteiro: ");
		valor1 = scan.nextInt();
		resto = valor1 % 2;
		
		if (resto == 0) {
			System.out.println("O numero é PAR");
			
		} else {
				
			System.out.println("O numero é IMPAR ");
			}
		
	}
	
}