/*	Crie um aplicativo que contenha 1 vetor de inteiro com 100 posições,
 inicialize o vetor, preencha-o com números aleatorios de 1 a 100, faça a soma te todos os números gerados e imprima o resultado.*/

import java.util.Random;

public class Ex1 {
	
	
	public static void main(String[] args) {
			
		Random ran = new Random();
		
		int[] array = new int[100];
		for (int i=0 ; i < 100; i++) {
			array[i] = ran.nextInt(1000);
		}
		long soma = 0;
		for(int item : array) {
			System.out.printf("Número %d\r\n",item);
			soma+=(long)item;
		}
		System.out.printf("A soma é %d",soma);
	}
	
}