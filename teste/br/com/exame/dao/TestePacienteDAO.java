package br.com.exame.dao;

import org.junit.Before;
import org.junit.Test;

import br.com.exame.TesteGenerico;
import br.com.exame.dominio.Paciente;

public class TestePacienteDAO extends TesteGenerico{
	@Before
	public void preparaAmbiente(){
		//TODO Limpar ambiente
	}
	
	@Test
	public void testaInsercaoPaciente() {
		Paciente paciente = new Paciente("Victor","3036-1519","8410-2485","Guara I");
		
	}
}
