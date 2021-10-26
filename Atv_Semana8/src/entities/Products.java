package entities;

public class Products {

	private String nome;
	private double preco;
	private double taxa;

	public Products(String nome, double preco, double iniTaxa) {
		super();
		this.nome = nome;
		this.preco = preco;
		soma(iniTaxa);
	}

	public Products(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void soma(double taxa) {
		
		preco += taxa;
	}

	@Override
	public String toString() {
		return nome + " = " + preco;
	}

	
	
}
