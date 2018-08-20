package br.com.db1;

import br.com.db1.type.TipoLogradouro;

public class ExemploEnum {

	public static void main(String[] args) {
		System.out.println(TipoLogradouro.RUA);
		System.out.println(TipoLogradouro.PRACA);
		System.out.println("----------------");
		System.out.println(TipoLogradouro.RUA.getDescricaoLogradouro());
		System.out.println(TipoLogradouro.PRACA.getDescricaoLogradouro());
		System.out.println("----------------");
		System.out.println(TipoLogradouro.RUA.getSiglaLogradouro());
		System.out.println(TipoLogradouro.PRACA.getSiglaLogradouro());
	}
}
