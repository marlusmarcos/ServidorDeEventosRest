package com.dimap.models;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	private  List<Interessado> participantes = new ArrayList<>();
	
	private String descricao;
	private Notificacao notificacao;
	

	public Notificacao getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(Notificacao notificacao) {
		this.notificacao = notificacao;
	}

	public List<Interessado> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Interessado> participantes) {
		this.participantes = participantes;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void addParticipante (Interessado p) {
		participantes.add(p);
	}
	public void notificar (Notificacao notifica) {
		
		for (Interessado p : participantes) {
			p.updateEvento(notifica);
		}
	}
	
}
