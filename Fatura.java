package MLP_SPI_2015_1_LISTA1;

public class Fatura {

	private String numero, descricao;
	private int qtde_item;
	private double prç_item, valorfatura;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtde_item() {
		return qtde_item;
	}
	public void setQtde_item(int qtde_item) {
		this.qtde_item = qtde_item;
	}
	public double getPrç_item() {
		return prç_item;
	}
	public void setPrç_item(double prç_item) {
		this.prç_item = prç_item;
	}
	
	public void setValorfatura (int qtde_item, double prç_item) {
		if (this.prç_item < 0 )  {
		    this.prç_item = 0.0;
		    this.valorfatura=prç_item*qtde_item;
		    if (this.valorfatura<0)
		        this.valorfatura=0;
		}
		if (this.prç_item > 0 )  {
		    this.valorfatura=prç_item*qtde_item;
		    if (this.valorfatura<0)
		        this.valorfatura=0;
		}
		
	}
		
	public double getValorfatura() {
		return valorfatura;
	}
	
	
	
}
