package com.ant.companies.model;

import com.ant.utility.model.entities.Entity;

public class Azienda extends Entity {
	
	private String nome, indirizzo, tel, email;
	
	public Azienda () {}
	
	

	public Azienda(int id, String nome, String indirizzo, String tel, String email) {
		super(id);
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.tel = tel;
		this.email = email;
	}



	@Override
	public boolean valid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "nome:" + nome + ", indirizzo:" + indirizzo + ", tel:" + tel + ", email:" + email + "]";
	}
	
	

}
