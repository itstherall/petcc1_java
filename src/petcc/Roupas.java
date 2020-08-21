package petcc;

public class Roupas
extends Produto{
	//atributos da classe Roupas
	int tamanho;
	String setor_moda;
	
	//constructor
	public Roupas(String nome, double preço, String cor, String categoria, String area, int tamanho,
			String setor_moda) {
		super(nome, preço, cor, categoria, area);
		this.tamanho = tamanho;
		this.setor_moda = setor_moda;
	}

	//metodos da classe Roupas:
	//metodo para informar se e qual produto foi cadastrado
	public String cadastrar() {
		return ("Roupa cadastrada!");
	}
		
	//getters e setters da classe
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getSetor_moda() {
		return setor_moda;
	}
	public void setSetor_moda(String setor_moda) {
		this.setor_moda = setor_moda;
	}
}
