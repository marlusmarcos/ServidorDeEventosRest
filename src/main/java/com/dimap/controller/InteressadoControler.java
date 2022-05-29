package com.dimap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimap.ReposittoryImpl.InteressadoImpl;
import com.dimap.models.Interessado;

@RestController
@RequestMapping(value = "/participante")
public class InteressadoControler {
	@Autowired
	InteressadoImpl interessado;

	@PostMapping("/{id}")
	public Interessado AddInteressado (@RequestBody Interessado p, @PathVariable int id) {
		interessado.addInteressado(id, p);
		return p;
	}
	
	//@GetMapping

}
