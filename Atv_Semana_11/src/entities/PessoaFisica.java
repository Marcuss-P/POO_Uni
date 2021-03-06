package entities;

public class PessoaFisica {

	private String nome;
	private double rendaAnual;
	private double gastoSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastoSaude = gastoSaude;
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

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public double impostoFisica(double rendaAnual, double gastoSaude) {
		double imposto;
		if(rendaAnual < 20000) {
			imposto = (rendaAnual * 0.15) - (gastoSaude * 0.50);
		}else {
			imposto = (rendaAnual * 0.25) - (gastoSaude * 0.50);
		}
		
		return imposto;
	}

	public String toString() {
		return "PessoaFisica: Nome = " + nome+ ", Imposto = " + String.format("%.2f", impostoFisica(rendaAnual, gastoSaude));
	}
	
	
}