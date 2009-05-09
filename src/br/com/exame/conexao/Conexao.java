package br.com.exame.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Conexao conexao;
	private Connection con;
	
	public static Conexao getInstancia(){
		if(conexao == null){
			conexao = new Conexao();
		}
		return conexao;
	}
	
	public Connection conectar() throws SQLException{
		String dvr = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mural";
		String usr = "root";
		String psw = "root";
		
		con = null;
		try{
			Class.forName(dvr);
			con = DriverManager.getConnection(url, usr, psw);
		}catch (Exception e) {
			throw new SQLException();
		}finally{
			return con;
		}
	}
	
	public void desconect() throws SQLException{
		con.close();
	}
}
