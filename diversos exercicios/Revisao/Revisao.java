import java.util.Scanner;

public class Revisao { //criação de uma classe

	String sobrenome;

	public static void main(String[] args){ //metodo principal //void é = nada //tipo de dados que no caso é um vetor String
		//Revisao.revisar();
		//System.out.println("Rodou");
		Revisao r = new Revisao(); //construindo um objeto a partir da classe revisao. executa o main
		
		Revisao.novoMetodo("Teste");
		r.revisar(); //chama o outro metodo, que só vai executar depois do main

		Scanner entrada = new Scanner(System.in); // in = entrada.. objeto de entrada de dados
		System.out.println("Ow, Fala alguma coisa!"); //vai só imprimir

		//r.outroMetodo();
		//r.novoMetodo("zé"); // como foi declarado no metodo que é string eu tenho que colocar algo do tipo string
		//r.verificaSeEoZe("João");//não faz nada porque não é o zé
		r.sobrenome = entrada.next(); //vai receber o que digitar 
		r.verificaSeEoZe(r.sobrenome);
		System.out.println("Rodou");

		//não posso criar um metodo dentro do outro metodo

	}
	public static void novoMetodo(String nome){ //esse metodo tem que receber um parametro dentro da variavel nome
		
		System.out.println(nome); //não passa outro tipo além de String

	}

	public void revisar(){//metodo da classe revisao // posso criar varios metodos porém nao podem ser dentro do metodo main,
	// tem que ser dentro da classe Revisao
		System.out.println("Estamos revisando!!");

	}

	public void outroMetodo(){ //este é outro metodo criados a partir da classe revisao // 
		System.out.println("Sou outro metodo!");
	}
	public boolean verificaSeEoZe (String nome){
		if (this.sobrenome.equals("Zé")) {
			System.out.println(" é o Zé");
			return true; //se for igual ao nome declarado na variavel nome executa o codigo
		}
		return false;// caso ao contrario não executa
	}
}