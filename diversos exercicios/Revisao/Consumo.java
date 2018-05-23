/*Crie um aplicativo que fique em execução permanente (loop) 
até que o usuario escolha a opção sair ou até que sejam registradas 10 informações

A cada execução do laço, solicite ao usuario a quilometragem percorrida e a quantidade de combustivel consumida,
assim como o valor total abastecido. EX: 300km, 26l, R$ 115,70

calcularquantos km foram realizadasa cada litro de combustivel,
quanto custou cada litro e quanto custou cada km. 

ao encerrar o laço, faça um calculo e exiba a quilometragem total, qual foi a media de consumo e qual o preço medio
pago por litro de combustivel */

import java.util.Scanner;

public class Consumo{

	public static void main (String[] args){ //exercicio será feito aqui dentro sem criar outros metodos
		Scanner scan = new Scanner(System.in);//está recebendo a entrada no scanner
		float[] kmLitro = new float[10]; //vetor para a km por litro, é a variavel que vai usar na opcao 1 do if
		float[]custoLitro = new float[10];
		float[] custoKm = new float[10];
		int contaRegistros = 0; //variavel contador para saber que chegou ao final

		while(true){ //enquanto for verdadeiro vai executar o codigo
			System.out.println("Escolha uma opção");
			System.out.println("\t1 para registrar"); //  \t = para dar um espaço para organizar
			System.out.println("\t0 para sair");
			int opcao = scan.nextInt(); //o tipo da variavel mais o que ela recebe
			if (opcao == 0){
				break; //encerra o programa
			}
			if (opcao == 1){ //vai coletar a informações
				float kmRealizado = 0.0f; //quantos km foi feito recebendo 0
				float consumo = 0.0f;
				float valor = 0.0f;
				System.out.println("Quantos km você andou?");
				kmRealizado = scan.nextFloat(); //vai receber o que o usuario digitar
				System.out.println("Quantos litros deu?");
				consumo= scan.nextFloat();
				System.out.println("Quanto ficou?");
				valor = scan.nextFloat();			
				//calcular quantos km por litro 
				kmLitro[contaRegistros] = (kmRealizado / consumo); //divisão //o registros soma mais 1 na posição
				//calcular custo por litro
				custoLitro[contaRegistros] = (valor / consumo); 
				//calcular custo por km
				custoKm[contaRegistros] = (valor / kmRealizado);
				contaRegistros++; // percorrer o vetor somando as linhas das variaveis.
				if (contaRegistros == 10){
					break; //quando chegar na posição numero 10 ele para
				}
				System.out.printf("Há %d  registros\r\n", contaRegistros);//informar ao usuario quantos registros ele tem
			}
			if(contaRegistros > 0){ 
				float somaConsumo = 0.0f;
				float somaCustoLitro = 0.0f;
				float somaCustoKm = 0.0f;
				
				for (int i=0; i < contaRegistros; i++){
					somaConsumo += kmLitro[i];
					somaCustoLitro += custoLitro[i];
					somaCustoKm += custoKm[i];
					
					
				}
				float mediaConsumo = (somaConsumo / contaRegistros);
				float mediaCustoLitro = (somaCustoLitro / contaRegistros);
				float mediaCustoKm = (somaCustoKm / contaRegistros);
				//vai mostrar o resultado das operaçoes acima
				System.out.printf(" O consumo medio é: %f km/l \r\n o custo por litro é: R$ %f \r\n o custo medio por km é: R$ %f", mediaConsumo, mediaCustoLitro, mediaCustoKm);	
				System.out.println("");
				System.out.println("");
			}	
		}
		System.out.println("\r\n The end !!!");
		

	}

}