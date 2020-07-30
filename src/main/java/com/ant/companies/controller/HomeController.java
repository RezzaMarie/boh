package com.ant.companies.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ant.companies.model.dao.DaoGeneric;
import com.ant.companies.model.entities.Azienda;
import com.ant.companies.model.entities.Dipendente;
import com.ant.companies.model.entities.Persona;
import com.ant.companies.model.entities.Status;
import com.ant.utility.model.database.Database;
import com.ant.utility.model.entities.Entity;

@RestController
@RequestMapping("/companies")

public class HomeController {

	@Autowired
	private DaoGeneric dao;
	
	@Autowired
	private Database db;
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired 
	private Map<String, String> query;

	@GetMapping("/aziende")
	public List<Entity> getAzienda() {
		String q = query.get("read_aziende");
		return dao.list(q, Azienda.class);
	}
	
	@GetMapping("/aziende/{id}")
	public Entity get(@PathVariable int id) {
		String q = query.get("read_aziende");
		return dao.search(id, q, Azienda.class);
	}
	
	@PostMapping("/aziende")
	public void post(@RequestBody Azienda azienda) {
		String q = query.get("create_aziende");
		dao.load(azienda, q);
	}
	
	@DeleteMapping("aziende/{id}")
	public void delete(@PathVariable int id) {
		String q = query.get("delete_aziende");
		dao.delete(id , q);
	}
	
	@PutMapping("/aziende")
	public void put(@RequestBody Azienda azienda) {
		String q = query.get("update_aziende");
		dao.load(azienda, q);
	}
	
	@GetMapping("/status")
	public List<Entity> getStatus() {
		String q = query.get("read_status");
		return dao.list(q, Status.class);
	}
	
	@GetMapping("/status/{id}")
	public Entity getStatus(@PathVariable int id) {
		String q = query.get("read_status");
		return dao.search(id, q, Status.class);
	}
	
	@GetMapping("/dipendenti")
	public List<Entity> getDipendenti() {
		String q = query.get("read_dipendenti");
		return dao.list(q, Dipendente.class);
	}
	
	@GetMapping("/dipendenti/{id}")
	public Entity getDipendente(@PathVariable int id) {
		String q = query.get("read_dipendenti");
		return dao.search(id, q, Dipendente.class);
	}
	
	@GetMapping("/persone")
	public List<Entity> getPersone() {
		String q = query.get("read_persone");
		return dao.list(q, Persona.class);
	}
	@GetMapping("/persone/{id}")
	public Entity getPersone(@PathVariable int id) {
		String q = query.get("read_persone");
		return dao.search(id, q, Persona.class);
	}
	
}
