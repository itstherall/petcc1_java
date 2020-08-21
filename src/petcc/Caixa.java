package petcc;

public class Caixa {
	//atributos da classe Caixa
	private int QuantidadeVendas;
	private double ValorNoCaixa;
	
	//constructor
	public Caixa() {
		QuantidadeVendas = 0;
		ValorNoCaixa = 0.0;
	}
	
	public Caixa(int quantidadeVendas, double valorNoCaixa) {	
		QuantidadeVendas = quantidadeVendas;
		ValorNoCaixa = valorNoCaixa;
	}
	
	
	//Metodos da classe Caixa
	//metodo 0
	public String Venda(double valor, int numero) {
		ValorNoCaixa =+ valor;
		QuantidadeVendas =+ numero;
		return "Compra efetuada no débito";
	}
	
	//metodo 1
	public String Venda(double valor, int numero, int parcela) {
		ValorNoCaixa =+ valor;
		QuantidadeVendas =+ numero;
		return ("Compra efetuada no credito em " + parcela) ;
	}
	
	//metodo 2
	public String Venda(double valorCompra, double valorPago) {
		//atributo aux apenas do metodo
		double troco = valorPago - valorCompra;
		
		ValorNoCaixa =+ valorPago - troco;
		QuantidadeVendas++;
		if(troco > 0.0) {
			return ("troco: " + troco);
		} else {	
			return ("Não há troco a ser devolvido");
		}	
	}
 
	
	//getters e setters dos atributos da classe Caixa
		public int getQuantidadeVendas() {
			return QuantidadeVendas;
		}
		public void setQuantidadeVendas(int quantidadeVendas) {
			QuantidadeVendas = quantidadeVendas;
		}
		public double getValorNoCaixa() {
			return ValorNoCaixa;
		}
		public void setValorNoCaixa(double valorNoCaixa) {
			ValorNoCaixa = valorNoCaixa;
		}
}
