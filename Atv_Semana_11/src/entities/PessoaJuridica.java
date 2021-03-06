package entities;

public class PessoaJuridica {

	private String nome;
	private double rendaAnual;
	private double funcionario;
	
	public PessoaJuridica(String nome, double rendaAnual, double funcionario) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public double getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(double funcionario) {
		this.funcionario = funcionario;
	}
	
	public double impostoJuridica(double rendaAnual, double funcionario) {
		double imposto;
		if(funcionario > 10) {
			imposto = (rendaAnual * 0.14);
		} else{
			imposto = (rendaAnual * 0.16);
		}
		
		return imposto;
	}

	@Override
	public String toString() {
		return "PessoaJuridica: nome = " + nome + ", Imposto = " + String.format("%.2f",impostoJuridica(rendaAnual, funcionario));
	}
}