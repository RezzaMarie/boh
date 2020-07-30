package com.ant.companies.model.entities;

import com.ant.utility.model.entities.Entity;

public class Dipendente extends Entity {

	private String mansione;
	private int stipendio;
	
	public Dipendente() {}
	
	public Dipendente(int id, String mansione, int stipendio) {
		super(id);
		this.mansione = mansione;
		this.stipendio = stipendio;
	}
	

	public String getMansione() {
		return mansione;
	}


	public void setMansione(String mansione) {
		this.mansione = mansione;
	}


	public int getStipendio() {
		return stipendio;
	}


	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	@Override
	public boolean valid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
