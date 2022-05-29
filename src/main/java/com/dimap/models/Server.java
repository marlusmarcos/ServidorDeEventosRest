package com.dimap.models;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private List<Evento> eventos = new ArrayList<>();
	private String nome;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void notificar (Notificacao notificacao, int id) {
		eventos.get(id).notificar(notificacao);
	}
	
//	public Evento criarEvento (String topico) {
//		Evento ev = new Evento (topico);
//		eventos.add(ev);
//		return ev;
//	}

}
