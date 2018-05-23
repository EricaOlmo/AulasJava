import java.util.Scanner;

public class Imc {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		Float altura;
		Float peso;
		Float result;
		
		System.out.println("Digite o peso: ");
		peso = scan.nextFloat();
		System.out.println("Digite a altura: ");
		altura = scan.nextFloat();
		result = peso / (altura * altura);
		System.out.println("Seu IMC é: " + result);
	}
	
}