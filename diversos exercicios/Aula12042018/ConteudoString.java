

public class ConteudoString {

	public static void main(String[] args){

		String minhaString = new String("meu texto");
		String outraString = "meu outro texto";
		String t = new String("teste");
		System.out.println(t.length()); //mostra quantas posições tem
		System.out.println(t.charAt(2)); //mostra qual caracter está na posição 2
		System.out.println("O " + t.charAt(2) + "em byte é " + Byte.valueOf( (byte) t.charAt(2) ) );

		t = t.concat("@abc");
		System.out.println(t);/*teste passa a adquirir abc, validando os valores*/

		System.out.println(t.contains("#")); //validando se true ou false 
		System.out.println(t.indexOf("@"));//em qual posição da minha string está o @
		System.out.println(t.lastIndexOf("e"));//em qual posição está o E na ultima posição que ele achar ele retorna

		String cpf = "111.111.111-11";//string é um cpf
		String email = "ericaborges97@hotmail.com";//esta string é um email

		System.out.println(cpf.matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$"));//combinar expressão regular, validação de numeros.

		//String cpf = "Ab1.111.111-11";
		//System.out.println(cpf.matches("^[a-zA-Z0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$")); //combinar expressão regular, validação de letras, maiusculas e miusculas.

		System.out.println(email.matches("^[a-z0-9\\-_\\.]+@[a-z0-9]+\\..+$"));//validando o email

		System.out.println( t.compareTo("teste@") );//comparações de strings a distancia entre os dois textos (igual uma pesquisa no google onde ja mostra a sugestão)
		System.out.println( t.compareToIgnoreCase("teste@") );// ignora a diferença de minusculas e maiusculas
		System.out.println(t.toUpperCase()); //deixa todas as letras maiusculas	
		System.out.println(t.toLowerCase()); //deixa todas as letras minusculas
		String[] split = t.split("@"); // vai gerar um arrey de duas posiçoes e separaros elementos
		System.out.println(split[0]);//primeira posição do arrey (teste)
		System.out.println(split[1]);//segunda posição do arrey (abc)


		//VALIDAÇÃO DE CPF

		ValidaCpf validador = new ValidaCpf();
		System.out.println("validação");
		System.out.println(validador.validar("529.982.247-25"));	

	}
}