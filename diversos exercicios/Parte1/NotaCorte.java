import java.util.Scanner;

public class NotaCorte {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		Float valor1;
		Float valor2;
		Float valor3;
		Float valor4;
		Float result;
		Float media;
		Float corte;
		
		System.out.println("Digite a primeira nota: ");
		valor1 = scan.nextFloat();
		System.out.println("Digite a segunda nota: ");
		valor2 = scan.nextFloat();
		System.out.println("Digite a terceira nota: ");
		valor3 = scan.nextFloat();
		System.out.println("Digite a quarta nota: ");
		valor4 = scan.nextFloat();
		result = valor1 + valor2 + valor3 + valor4;
		media = result / 4;
		System.out.println("Informe a nota de corte: ");
		corte = scan.nextFloat();
		
		if (media >= corte){
			System.out.println("APROVADO!");
			
		} else {
			System.out.println("REPROVADO!");
		}
		
	}
	
}