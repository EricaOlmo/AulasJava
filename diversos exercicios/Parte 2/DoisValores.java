import java.util.Scanner;

public class DoisValores {
	public static void main (String []args){
		
		Scanner scan = new Scanner (System.in);
	
		int valor1;
		int valor2;
		int entrada1;
		int entrada2;
		
		System.out.println("Digite o primeiro numero: ");
		entrada1 = scan.nextInt();
		System.out.println("Digite o ultimo numero: ");
		entrada2 = scan.nextInt();
		
		if ( entrada1 < entrada2) {
			valor1 = entrada1;
			valor2 = entrada2;
			
		}else{
			valor1 = entrada2;
			valor2 = entrada1;
		}		
		for (int i = valor1; i <=valor2; i++){
			System.out.println(i);
		}
	 }
	}
	
		
