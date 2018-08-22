package br.com.db1.oo;

public class PessoaJuridica extends Pessoa  implements RecFederal{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Boolean validadorCnpj(){
		return true;
	}

	public String codigoDaDeclaracaoDoImpostoDeRenda() {
		return null;
	}
}
