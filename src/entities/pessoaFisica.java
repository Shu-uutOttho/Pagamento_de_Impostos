package entities;

public class pessoaFisica extends contribuinte {
	private double gastoSaude;

	public pessoaFisica() {
	}

	public pessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double impostoBase = (getRendaAnual() < 20000.0) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
		impostoBase -= getGastoSaude() * 0.5;
		if (impostoBase < 0.0) {
			impostoBase = 0.0;
		}

		return impostoBase;
	}

}
