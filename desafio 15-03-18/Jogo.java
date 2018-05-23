import java.util.Scanner;
import java.util.Random;

public class Jogo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		
		int aleatorio = ran.nextInt(100);
	
		int tentativasMax = 7;
		int tentativasAtuais = tentativasMax;
		boolean venceu = false;
		
		System.out.println("Escolha um numero aleatorio entre 0 e 100");
		boolean space = false;
		while (tentativasAtuais != 0 && venceu == false) {
			
			if (space == false) {
				space = true;
				System.out.println("");
			}
			System.out.println("Digite um número: (" + tentativasAtuais + ")");
			String nDigitado = scan.next();
			
			if (nDigitado.equals("e")) {
				System.out.println("");
				System.out.println("**FIM DE JOGO**");
				System.out.println("");
			} else if (Integer.parseInt(nDigitado) == aleatorio) {
				System.out.println("");
				System.out.println("Parabéns! Você acertou!!! ");
				System.out.println("");
				venceu = true;
			} else {
				System.out.println("");
				System.out.println("Que pena, você errou ");
		
					if (Integer.parseInt(nDigitado) < aleatorio) {
						System.out.println(" O numero é maior!");
						System.out.println("");
					} else {
						System.out.println(" O numero é menor! ");
						System.out.println(""); 
					}
			 
				tentativasAtuais -= 1;
				if (tentativasAtuais == 0) { 
					System.out.println("");
					System.out.println("FIM DE JOGO. SUAS TENTATIVAS ACABARAM!  (" + aleatorio +")");
					System.out.println("");
				}
			}
		}
	}
}	