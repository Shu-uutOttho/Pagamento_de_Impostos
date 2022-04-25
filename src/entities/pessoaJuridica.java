package entities;

public class pessoaJuridica extends contribuinte {
	private Integer numeroDeFuncionarios;

	pessoaJuridica() {
	}

	public pessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		if (numeroDeFuncionarios > 10) {

			return getRendaAnual() * 0.14;
		} else {

			return getRendaAnual() * 16;
		}

	}
}
