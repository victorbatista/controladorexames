package br.com.exame.dominio;

import java.sql.Date;

public class Prontuario {
	private int id;
	private int crmMedico;
	private int idExam;
	private int idPacient;
	private Date dataExam;
	private String obs;
	private String result;
	
	public Prontuario() {
		super();
	}

	public Prontuario(int id, int crmMedico, int idExam, int idPacient,
			Date dataExam, String obs, String result) {
		super();
		this.id = id;
		this.crmMedico = crmMedico;
		this.idExam = idExam;
		this.idPacient = idPacient;
		this.dataExam = dataExam;
		this.obs = obs;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(int crmMedico) {
		this.crmMedico = crmMedico;
	}

	public int getIdExam() {
		return idExam;
	}

	public void setIdExam(int idExam) {
		this.idExam = idExam;
	}

	public int getIdPacient() {
		return idPacient;
	}

	public void setIdPacient(int idPacient) {
		this.idPacient = idPacient;
	}

	public Date getDataExam() {
		return dataExam;
	}

	public void setDataExam(Date dataExam) {
		this.dataExam = dataExam;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
