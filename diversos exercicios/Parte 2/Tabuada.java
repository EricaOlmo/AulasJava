import java.util.Scanner;

public class Tabuada {
	
	public static void main (String []args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual a tabuada desejada? ");
		
		while(true){
			int num1 = s.nextInt();
			
			if(num1 == -1)
			break;
			
			if (num1 > 0){
				for(int i = 1; i <= 10; i++){
					System.out.println(num1 + "*" + i + "=" + num1*i);
				
				}
			
			}else;
			
		}
		
	}
	
}