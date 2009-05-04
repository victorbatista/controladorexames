package br.com.exame.dominio;

public class Medico {
	private int crm;
	private String nome;
	private String telRes;
	private String telCel;
	private String especialidade;
	
	public Medico() {
		super();
	}
	
	public Medico(String nome, String telRes, String telCel, String especialidade) {
		super();
		this.nome = nome;
		this.telRes = telRes;
		this.telCel = telCel;
		this.especialidade = especialidade;
	}
	
	public Medico(int crm, String nome, String telRes, String telCel, String especialidade) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.telRes = telRes;
		this.telCel = telCel;
		this.especialidade = especialidade;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelRes() {
		return telRes;
	}

	public void setTelRes(String telRes) {
		this.telRes = telRes;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
