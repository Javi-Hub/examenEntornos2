package com.savalero.examenWebinar2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sanvalero.examenWebinar2.model.Usuario;
import com.sanvalero.examenWebinar2.model.Visitante;

public class ConcursoTest {

	private static Usuario nuevoUsuario;
	
	@Test
	public static void registrarUsuarioTest() {
		nuevoUsuario = new Usuario();
		Visitante nuevoVisitante = new Visitante("j@x.com", "2");
		
		assertEquals(false, nuevoUsuario.registrarUsuario(nuevoVisitante));
		
	}
	
}
