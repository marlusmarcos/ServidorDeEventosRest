package com.dimap.ReposittoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.dimap.interfaces.repository.IServer;
import com.dimap.models.Evento;
import com.dimap.models.Server;

@Component
public class ServerImpl implements IServer{
	
	private List<Server> servers = null;;
	private List<Evento> eventos = new ArrayList<>();
	
	
	
	@Override
	public Server addServer( Server server) {
		if (servers == null) {
		servers = new ArrayList<>();
		}
		servers.add(server);
		return server;
	}
	
	public List<Server> getAll() {
		return this.servers;
	}
	
	public Evento addEvento(Evento e) {
		if (servers == null) {
			return null;
		}
		eventos.add(e);
		return e;
	}
	
	public List<Evento> getEventos () {
		return eventos;
	}
	
	public Evento getEvento (int i) {
		return eventos.get(i);
	}
	
	
 
}
