package com.dimap.models;

import java.util.ArrayList;
import java.util.List;

public class Interessado {
	
	private  String nome;
	
	private String email;
	
	private List<Notificacao> notificacoes = new ArrayList<>(); 
	
	public Notificacao updateEvento (Notificacao mensagem) {
		System.out.println(mensagem);
		notificacoes.add(mensagem);
		return mensagem;
	}

	public List<Notificacao> getNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(List<Notificacao> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
