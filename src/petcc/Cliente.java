package petcc;

public class Cliente
extends Pessoa {
	//atributos da classe cliente(subclasse de pessoa)
	String email;
	int qnt_de_compras;
	double desconto;
	
	//getters e setters da classe Cliente
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQnt_de_compras() {
		return qnt_de_compras;
	}
	public void setQnt_de_compras(int qnt_de_compras) {
		this.qnt_de_compras = qnt_de_compras;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
