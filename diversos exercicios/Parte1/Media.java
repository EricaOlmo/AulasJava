import java.util.Scanner;

public class Media {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		Float valor1;
		Float valor2;
		Float valor3;
		Float valor4;
		Float result;
		Float div;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		valor2 = scan.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		valor3 = scan.nextFloat();
		System.out.println("Digite o quarto valor: ");
		valor4 = scan.nextFloat();
		result = valor1 + valor2 + valor3 + valor4;
		div = result / 4;
		System.out.println("A media dos valores é " + div);
	}
	
}