package com.sanvalero.examenWebinar2.model;

public class Visitante {
	
	private String email;
	private String contrasena;
	private Visitante visitante;

	
	public Visitante(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	

}
