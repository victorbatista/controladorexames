package br.com.exame.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T>{
	public void salvar (T tipo) throws SQLException;
	public void atualizar(T tipo);
	public T recuperar(int id_tipo);
	public List<T> recuperarIntervalo(int intervalo, int qtdElemen);
	public List<T> recuperarTodos();
	public void remover(int id_tipo);
	
}
