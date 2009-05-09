package br.com.exame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.exame.conexao.Conexao;
import br.com.exame.dao.DAO;
import br.com.exame.dao.implementacao.PacienteDAO;
import br.com.exame.dominio.Paciente;

public class TesteGenerico {
	
	
	public void limpaTabelaPaciente(){
		String sql = "DROP paciente";
		Connection con;
		try {
			con = Conexao.getInstancia().conectar();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
