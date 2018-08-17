package br.com.db1.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EstadosDoBrasil {

	PARANA("Paraná", "PR"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
	SAO_PAULO("São Paulo", "SP"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	ESPIRITO_SANTO("Espírito Santo", "ES");
	
	private String nomeDoEstado;
	private String uf;
	
	public String getUf() {
		return uf;
	}

	public String getNomeDoEstado() {
		return nomeDoEstado;
	}
	
	private EstadosDoBrasil(String nome, String uf) {
		this.nomeDoEstado = nome;
		this.uf = uf;
	}
	
	public static List<EstadosDoBrasil> getEstadosDoSul(){
		List<EstadosDoBrasil> uf = new ArrayList<EstadosDoBrasil>();
		uf.add(EstadosDoBrasil.PARANA);
		uf.add(EstadosDoBrasil.SANTA_CATARINA);
		uf.add(EstadosDoBrasil.RIO_GRANDE_DO_SUL);
		return uf;
		
	}
	
	public static List<EstadosDoBrasil> getEstadosDoSudeste(){
		return Arrays.asList(SAO_PAULO, RIO_DE_JANEIRO
							, MINAS_GERAIS,ESPIRITO_SANTO);
	}
	
}
