public class ArCond {
	
	public String status;
	public int temperatura;
	
	public ArCond (){
		this.status = "desligado";
		this.temperatura = 26;
	}
	
	public void power();{
		if (status.equals("desligado")){
			this.status = "ligado";
			System.out.println("Ar Ligado!");
			System.out.println("Temperatura " + this.temperatura);
		} else {
			this.status = "Desligado";
			System.out.println("Ar Desligado");
			
		}
	}
}