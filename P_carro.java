package MLP_SPI_2015_1_LISTA1;

import java.util.Scanner;

public class P_carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro vt = new Carro ();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a cor do veículo: ");
		vt.setCor(scan.nextLine());
		System.out.println("Digite o modelo do veículo: ");
		vt.setModelo(scan.nextLine());
		System.out.println("Digite a velocidade atual: ");
		vt.setVelAtual(scan.nextInt());
		System.out.println("Digite sua velocidade máxima: ");
		vt.setVelMaxima(scan.nextInt());

		System.out.printf("Cor: %s\n", vt.getCor());
		System.out.printf("Modelo: %s\n", vt.getModelo());
		vt.Ligar(vt.getVelAtual()); 
		vt.Acelerar(vt.getVelAtual());		
		
	}
	

}
