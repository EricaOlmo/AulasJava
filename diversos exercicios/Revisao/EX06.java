//receba um numero de 1 a 12 e exiba o nome do respectivo mes
import java.util.Scanner;

public class EX06{
	public static void main(String[] args){

		Scanner scan = new Scanner (System.in);

		System.out.println("Informe um numero de 1 a 12");
		int num = scan.nextInt(); //declaração com uma atribuição

		while (num < 1 ||  num > 12) {//enquanto menor que 1 ou maior que 12 é invalido
			System.out.printf("O numero informado não é valido. Tente novamente."+num); 
			num= scan.nextInt();
		}

		switch (num){ 
			case 1:
				System.out.println("Janeiro");
				break; 
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;  
			case 4:
				System.out.println("Abril");
				break; 
			case 5:
				System.out.println("Maio");
				break; 
			case 6:
				System.out.println("Junho");
				break; 
			case 7:
				System.out.println("Julho");
				break; 
			case 8:
				System.out.println("Agosto");
				break; 
			case 9:
				System.out.println("Setembro");
				break; 
			case 10:
				System.out.println("Outubro");
				break; 
			case 11:
				System.out.println("Novembro");
				break; 
			case 12:
				System.out.println("Dezembro");
				break; 
			default:
			break; //default é obrigatorio
		}
	}
}