package br.com.exame.dominio;

public class Paciente {
	private int id;
	private String nome;
	private String telCel;
	private String telRes;
	private String end;
	
	public Paciente() {
		super();
	}

	public Paciente(String nome, String telCel, String telRes, String end) {
		super();
		this.nome = nome;
		this.telCel = telCel;
		this.telRes = telRes;
		this.end = end;
	}

	public Paciente(int id, String nome, String telCel, String telRes,
			String end) {
		super();
		this.id = id;
		this.nome = nome;
		this.telCel = telCel;
		this.telRes = telRes;
		this.end = end;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public String getTelRes() {
		return telRes;
	}

	public void setTelRes(String telRes) {
		this.telRes = telRes;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
}
