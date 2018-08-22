package br.com.db1.oo;

import java.util.List;

public class Pessoa {

	private String cpf;

	private String nome;

	private Endereco endereco ;

	private List<Telefone> telefones;

	protected String getCpf() {
		return cpf;
	}

	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
