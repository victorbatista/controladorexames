package br.com.exame.dominio;

public class Exame {
	private int idExame;
	private String tipoExame;
	
	public Exame(){
		super();
	}
	
	public Exame(int idExame, String tipoExame) {
		super();
		this.idExame = idExame;
		this.tipoExame = tipoExame;
	}

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	
}
