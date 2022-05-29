package com.dimap.ReposittoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dimap.interfaces.repository.IEvento;
import com.dimap.models.Evento;
import com.dimap.models.Interessado;
import com.dimap.models.Notificacao;

@Component
public class EventoImpl implements IEvento{
	//private List<Interessado> interessados = new ArrayList<>();

	@Autowired
	ServerImpl server;
	
	@Override
	public Evento addEvento(Evento ev) {
		server.addEvento(ev);
		return  ev;
	}
	
	public List <Evento> getEventos () {
		return server.getEventos();
	}
	public Evento getEvento (int id) {
		return server.getEvento(id);
	}
	
	public Interessado addParticipante (int id, Interessado p) {
		server.getEvento(id).addParticipante(p);
		return p;
	}
	
	public void notificar (Notificacao menssagem, int i) {
		server.getEvento(i).notificar(menssagem);
	}
}
