package br.com.db1.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EstadosDoBrasilTest {

	@Test
	public void testarNomeDosEstadosTest(){
		assertEquals("Paraná", EstadosDoBrasil.PARANA.getNomeDoEstado());
	}
	
	@Test
	public void estadosdoSulTest(){
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.PARANA));
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.SANTA_CATARINA));
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.RIO_GRANDE_DO_SUL));
		assertFalse(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.SAO_PAULO));
	}
	
	@Test
	public void estadosdoSudesteTest(){
		assertTrue(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.SAO_PAULO));
		assertFalse(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.PARANA));
	}
}
