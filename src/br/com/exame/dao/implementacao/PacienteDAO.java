package br.com.exame.dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.exame.conexao.Conexao;
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
	public void salvar(Paciente paciente) throws SQLException {
		String sql = "INSERT INTO paciente (nome, tel_res, tel_cel, endereco) VALUES (?,?,?,?)";
		
		Connection con = Conexao.getInstancia().conectar();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, paciente.getNome());
		stmt.setString(2, paciente.getTelRes());
		stmt.setString(3, paciente.getTelCel());
		stmt.setString(4, paciente.getEnd());
		stmt.executeUpdate();
		
	}
	
}
