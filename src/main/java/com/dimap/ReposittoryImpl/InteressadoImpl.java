package com.dimap.ReposittoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dimap.interfaces.repository.IInteressado;
import com.dimap.models.Interessado;
@Component
public class InteressadoImpl implements IInteressado{
	
	private List<Interessado> interessados = new ArrayList<>();
	@Autowired
	EventoImpl eventoImpl;

	@Override
	public Interessado addinteressado(Interessado in) {
		interessados.add(in);
		return in;
	}
	
	public String exibirNotificacao () {
		return "";
	}
	
	public Interessado addInteressado (int i, Interessado p) {
		eventoImpl.addParticipante(i, p);
		return p;
	}
	

}
