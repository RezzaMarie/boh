package com.ant.companies.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
	public List<Entity> get() {
		String q = query.get("read_aziende");
		return dao.list(q, Azienda.class);
	}
	
	@GetMapping("/aziende/{id}")
	public Entity get(@PathVariable int id) {
		String q = query.get("read_aziende");
		return dao.search(id, q, Azienda.class);
	}
	
	@PostMapping
	public void post(@RequestBody Azienda azienda) {
		String q = query.get("create_aziende");
		dao.load(azienda, q);
	}
	
	@DeleteMapping("aziendedelete/{id}")
	public void delete(@PathVariable int id) {
		String q = query.get("delete_aziende");
		dao.delete(id , q);
	}
	
	@PutMapping
	public void put(@RequestBody Azienda azienda) {
		String q = query.get("update_aziende");
		dao.load(azienda, q);
	}
}
