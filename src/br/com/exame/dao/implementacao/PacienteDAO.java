package br.com.exame.dao.implementacao;

import java.sql.Connection;
import java.util.List;

import br.com.exame.dao.DAO;
import br.com.exame.dominio.Paciente;

public class PacienteDAO implements DAO<Paciente>
{
	private Connection conexao;
	
	public PacienteDAO(){
		super();
	}

	@Override
	public void atualizar(Paciente tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente recuperar(int id_tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> recuperarIntervalo(int intervalo, int qtdElemen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(int id_tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar(Paciente tipo) {
		// TODO Auto-generated method stub
		
	}
	
}
