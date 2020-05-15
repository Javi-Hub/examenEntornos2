package com.sanvalero.examenWebinar2.model;

public class Colegio {
	
	private String email;
	private String contrasena;
	private String direccion;
	private String personaContacto;
	
	public Colegio(String email, String contrasena, String direccion, String personaContacto) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		this.direccion = direccion;
		this.personaContacto = personaContacto;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	
}
