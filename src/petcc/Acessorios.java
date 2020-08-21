package petcc;

public class Acessorios
extends Produto{
	//atributos da classe Acessorios
	String formato;
	String material;
	
	//constructor
	public Acessorios(String nome, double preço, String cor, String categoria, String area, String formato,
			String material) {
		super(nome, preço, cor, categoria, area);
		this.formato = formato;
		this.material = material;
	}

	//metodos:
	//metodo para informar se e qual produto foi cadastrado
	public String cadastrar() {
		return ("Acessório cadastrado!");
	}
	
	//getters e setters ca classe Acessorios
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
