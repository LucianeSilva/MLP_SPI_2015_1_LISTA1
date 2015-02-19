package MLP_SPI_2015_1_LISTA1;

public class Carro {
	
	private String cor, modelo;
	private double velAtual, velMaxima;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelAtual() {
		return velAtual;
	}
	public void setVelAtual(int velAtual) {
		this.velAtual = velAtual;
	}
	public double getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	public void Ligar(double velAtual) {
		if (velAtual>0) {
         System.out.println("Veículo em movimento");
	    }
		if (velAtual==0){
		 System.out.println("Veículo Parado");
	}	
		if (velAtual<0){
		  System.out.println("Veículo em frenagem");
		}	
	}	
		
	public void  Acelerar(double velAtual) {
		if (this.velAtual>this.velMaxima) 
			System.out.println("Veículo ultrapassou velocidade máxima");  
	
	}
	
	

}
