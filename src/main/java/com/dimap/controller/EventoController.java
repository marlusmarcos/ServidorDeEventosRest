package com.dimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimap.ReposittoryImpl.EventoImpl;
import com.dimap.models.Evento;
import com.dimap.models.Notificacao;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {
	
	@Autowired
	private EventoImpl eventoimpl;
	
	
	@PostMapping
	public Evento addEvento(@RequestBody Evento ev) {
		eventoimpl.addEvento(ev);
		return ev;
	}
	
	@GetMapping
	public List <Evento> getEventos () {
		return eventoimpl.getEventos();
	}
	
	@GetMapping("/{id}")
	public Evento getEvento (@PathVariable int id) {
		return eventoimpl.getEvento(id);
	}
	
	@PostMapping("/notificar/{id}")
	public Notificacao notificar (@RequestBody Notificacao m,@PathVariable  int id) {
		eventoimpl.notificar(m, id);
		return m;
	}
	
	//public Interessado addParticipante (int i, Interessado p ) {
	//	return eventoimpl.
	//}

}
