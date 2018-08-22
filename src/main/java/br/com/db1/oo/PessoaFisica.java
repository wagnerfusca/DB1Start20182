package br.com.db1.oo;

public class PessoaFisica extends Pessoa implements RecFederal{

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Boolean validadorCpf(){
		return Boolean.TRUE;
	}

	public String codigoDaDeclaracaoDoImpostoDeRenda() {
		return null;
	}
}
