package petcc;

public class Produto {
	String nome;
	double preco;
	String cor;
	String categoria;
	//a area condiz a se o produto e masculio, feminino ou infantil
	String area;
	
	public Produto(String nome, double preco, String cor, String categoria, String area) {
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
		this.categoria = categoria;
		this.area = area;
	}
	
	//metodos da classe produto
	//o metodo cadastrar avisa quando o produto foi cadastrado
	public String cadastrar(){
		return ("o produto foi cadastrado");
	}
	
	//getters e setters dos atributos da classe produto
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreço(double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
