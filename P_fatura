package MLP_SPI_2015_1_LISTA1;

import java.util.Scanner;

public class P_fatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fatura ft = new Fatura ();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o número da fatura: ");
		ft.setNumero(scan.nextLine());
		System.out.println("Digite a descrição do item: ");
		ft.setDescricao(scan.nextLine());
		System.out.println("Digite a quantidade: ");
		ft.setQtde_item(scan.nextInt());
		System.out.println("Digite o preço: ");
		ft.setPrç_item(scan.nextDouble());

		System.out.printf("Número Fatura: %s\n", ft.getNumero());
		System.out.printf("Descrição do Item: %s\n", ft.getDescricao());
		System.out.printf("Quantidade: %d\n", ft.getQtde_item());
		System.out.printf("Preço: %.2f\n", ft.getPrç_item());
		ft.setValorfatura(ft.getQtde_item(), ft.getPrç_item());
		System.out.printf("Valor total da Fatura: %.2f\n", ft.getValorfatura());
		
	} 

		
		
	}
