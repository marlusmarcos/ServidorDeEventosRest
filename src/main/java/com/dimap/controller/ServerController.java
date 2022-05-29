package com.dimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimap.ReposittoryImpl.ServerImpl;
import com.dimap.models.Evento;
import com.dimap.models.Server;

@RestController
@RequestMapping(value = "/server")
public class ServerController {
	
	@Autowired
	private ServerImpl server;
	
	@GetMapping
	public List<Server> getServer() {
		return server.getAll();
	}
	@PostMapping
	public Server novoServer (@RequestBody Server serve) {
		return server.addServer(serve);
	}
	
	@GetMapping("/{id}")
	public Evento getEvento (@PathVariable int id) {
		return server.getEvento(id);
	}
	@GetMapping("/eventos")
	public List<Evento> getEventos () {
		return server.getEventos();
	}

}
