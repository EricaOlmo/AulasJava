import java.util.Scanner;
public class ArCondicionado {
	public static void main(String[] args){
		
		Scanner ar = new Scanner(System.in);
		int temperatura;
		System.out.println("Qual temperatura você deseja?");
		temperatura = ar.nextInt();
		System.out.println("O Ar Condicionado está ligado em " + temperatura +" graus!");
	}
}