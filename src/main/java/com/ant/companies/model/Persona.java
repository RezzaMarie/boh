package com.ant.companies.model;

import java.util.Date;

import com.ant.utility.model.entities.Entity;

public class Persona extends Entity{
	private String nome, cognome;
	private Date datanascita;
	private int idstatus;
	
	public Persona () {}
	
	public Persona (int id, String nome, String cognome, Date datanascita, int idstatus) {
		super(id);
		this.nome = nome;
		this.cognome = cognome;
		this.datanascita = datanascita;
		this.idstatus = idstatus;
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}

	public int getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}

	
	@Override
	public boolean valid() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "nome:" + nome + ", cognome:" + cognome + ", datanascita:" + datanascita + ", idstatus:" + idstatus
				+ "]";
	}

}
