package com.sanvalero.examenWebinar2.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private List<Visitante> visitantes;
	
	
	public Usuario() {
		visitantes = new ArrayList<>();
		
	}
	
	public boolean registrarUsuario(Visitante visitante) {
		for(Visitante nuevoVisitante : visitantes) {
			if(nuevoVisitante.getEmail().equals(visitante.getEmail())) {
				return false;
			}
		}
		return true;	
	}
	
}
