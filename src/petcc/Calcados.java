package petcc;

public class Calcados 
extends Roupas{
	//atributos da classe calcados
	int tamanho;
	boolean fechado;
	boolean baixo;
	
	//contructor
	public Calcados(String nome, double preço, String cor, String categoria, String area, int tamanho,
			boolean fechado, boolean baixo) {
		super(nome, preço, cor, categoria, area, tamanho, area);
		this.fechado = fechado;
		this.baixo = baixo;
	}

	//metodos da classe Calçados:
	//metodo para informar se e qual produto foi cadastrado
	public String cadastrar() {
		return ("Calcado cadastrado!");
	}
	
	//getters e setters da classe Calcados
	public int getTamanhoC() {
		return tamanho;
	}
	public void setTamanhoC(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isFechado() {
		return fechado;
	}
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	public boolean isBaixo() {
		return baixo;
	}
	public void setBaixo(boolean baixo) {
		this.baixo = baixo;
	}
}
