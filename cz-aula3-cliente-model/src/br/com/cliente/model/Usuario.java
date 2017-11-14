package br.com.cliente.model;

public class Usuario {

	private String usuario;
	private String senha;
	
	/**
	 * Construtor Default
	 */
	public Usuario() {
		
	}
	
	/*
	 * Construtor com parametos
	 */
	
	public Usuario(String usuario, String senha) {
		
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

