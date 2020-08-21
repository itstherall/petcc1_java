package petcc;

public class Funcionario
extends Pessoa{
	//atributos da classe Funcionario(subclasse da classe pessoa)
	double salario;
	int qnt_de_vendas;
	
	//constructor
	public Funcionario() {
		super();
		this.salario = 0.0;
		this.qnt_de_vendas = 0;
	}
	
	//getters e setters da classe Funcionario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQnt_de_vendas() {
		return qnt_de_vendas;
	}
	public void setQnt_de_vendas(int qnt_de_vendas) {
		this.qnt_de_vendas = qnt_de_vendas;
	}
	
}
